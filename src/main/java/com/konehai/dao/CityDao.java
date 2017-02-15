package com.konehai.dao;

import com.konehai.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HP on 13-02-2017.
 */
@Transactional
public interface CityDao extends CrudRepository<City,Integer> {

    public City findByCityName(String cityName);
}
