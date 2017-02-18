package com.konehai.service;

import com.konehai.dao.SocietyDao;
import com.konehai.model.Society;
import com.konehai.response.BuildingNameResponse;
import com.konehai.response.HouseNameResponse;
import com.konehai.response.SocietyNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by imittal on 2/18/17.
 */
@Service
public class SocietyService {

    @Autowired
    private SocietyDao societyDao;

    public List<SocietyNameResponse> getSocietyNames() {
        List<Society> societies = new ArrayList<>();
        societyDao.findAll().forEach(societies::add);
        List<SocietyNameResponse> societyResponse = new ArrayList<>();
        for (Society society : societies) {
            SocietyNameResponse societyNameResponse = new SocietyNameResponse();
            societyNameResponse.setSocietyName(society.getSocietyName());
            societyNameResponse.setSocietyCode(society.getSocietyCode());
        }

        return societyResponse;

    }

    public List<HouseNameResponse> getHouseNames(String buildingName, String societyCode) {
        return societyDao.findBySocietyCodeAndBuildingName(societyCode, buildingName);
    }

    public List<BuildingNameResponse> getBuildingNames(String societyCode) {
        return societyDao.findBySocietyCode(societyCode);
    }

}
