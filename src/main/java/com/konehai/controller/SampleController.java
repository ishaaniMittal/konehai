package com.konehai.controller;

import com.konehai.model.City;
import com.konehai.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/city")
@RestController
public class SampleController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/addCity/{cityName}")
    @ResponseBody
    public String addCity(@PathVariable String cityName) {
        return cityService.addCity(cityName);
    }

    @RequestMapping("/findCity")
    public @ResponseBody
    City getCityById(int cityId)
    {
        return cityService.getCityById(cityId);
    }

    @RequestMapping("/getCities")
    public @ResponseBody
    List<City> getAllCities()
    {
        return cityService.getAllCities();
    }





}