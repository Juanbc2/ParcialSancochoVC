package com.udea.parcial2.dao;

import com.udea.parcial2.model.Weather;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClimateDAO extends CrudRepository<Weather, Long> {


    Optional<Weather> findByNombreCiudadAndNombrePais(String nombreCiudad, String nombrePais);

}