package com.konehai.service;

import com.konehai.dao.CityDao;
import com.konehai.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP on 13-02-2017.
 */
@Service
public class CityService {
    @Autowired
    private CityDao cityDao;

    public String addCity(String cityName)
    {
        City city=new City(cityName);
        try {
            cityDao.save(city);
        }catch (Exception e)
        {
            return "Could not add city in the database\n."+e.toString();

        }
        return "Successfully added "+city.getCityName()+" in the database.";
    }

    public City getCityById(int cityId)
    {
        return cityDao.findOne(cityId);
    }

    public List<City> getAllCities()
    {
        return (List<City>) cityDao.findAll();
    }
}
