package com.udea.parcial2.controller;

import com.udea.parcial2.exception.ModelNotFoundException;
import com.udea.parcial2.model.Weather;
import com.udea.parcial2.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/weather")
@CrossOrigin("*")
@Api(value = "Employee Management System", description = "Operations pertaining to employee in clima Management System")
public class WeatherController {

    @Autowired
    WeatherService WeatherService;

    @ApiOperation(value = "Add weather city data")
    @PostMapping("/save")
    public long save(
            @ApiParam(value = "Employee object store in database table", required = true) @RequestBody Weather clima) {
        WeatherService.save(clima);
        return clima.getId();
    }

    @ApiOperation(value = "View a list of available weather", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    @GetMapping("/listAll")
    public Iterable<Weather> listAllclimas() {
        return WeatherService.list();
    }

    @ApiOperation(value = "Get a clima by Id")
    @GetMapping("/list/{id}")
    public Weather listclimaById(
            @ApiParam(value = "Employee id from which employee object will retrieve", required = true) @PathVariable("id") int id) {
        Optional<Weather> clima = WeatherService.listId(id);
        if (clima.isPresent()) {
            return clima.get();
        }

        throw new ModelNotFoundException("ID de Weather invalido");
    }

}
