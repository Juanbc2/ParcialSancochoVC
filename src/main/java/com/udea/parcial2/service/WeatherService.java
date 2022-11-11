package com.udea.parcial2.service;

import com.udea.parcial2.dao.IClimateDAO;
import com.udea.parcial2.model.Weather;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private IClimateDAO dao;

    public Weather save(Weather t) {
        return dao.save(t);
    }

    public Weather update(Weather t) {
        return dao.save(t);
    }

    public void delete(Weather t) {
        dao.delete(t);
    }

    public Iterable<Weather> list() {
        return dao.findAll();
    }

    public Optional<Weather> listId(long id) {
        return dao.findById(id);
    }

    public Optional<Weather> findByNombreCiudadAndNombrePais(String nombreCiudad, String nombrePais) {

        return dao.findByNombreCiudadAndNombrePais(nombreCiudad, nombrePais);
    }
}
