package com.udea.parcial2.dao;

import com.udea.parcial2.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityDAO extends CrudRepository<City, Long> {

}
