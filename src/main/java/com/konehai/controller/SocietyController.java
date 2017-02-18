package com.konehai.controller;

import com.konehai.response.BuildingNameResponse;
import com.konehai.response.HouseNameResponse;
import com.konehai.response.SocietyNameResponse;
import com.konehai.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by imittal on 2/18/17.
 */
@RequestMapping("/society")
@RestController
public class SocietyController {

    @Autowired
    SocietyService societyService;

    @RequestMapping(value = "/name")
    public List<SocietyNameResponse> getSocietyNames() {
        return societyService.getSocietyNames();
    }

    @RequestMapping(value = "/houseNos")
    public List<HouseNameResponse> getHouseNamesBasedOnSocietyAndBuilding(@PathParam("buildingName") String buildingName, @PathParam("societyCode") String societyCode) {
        return societyService.getHouseNames(buildingName, societyCode);
    }

    @RequestMapping(value = "/buildingNames")
    public List<BuildingNameResponse> getBuildingNamesBasedOnSocietyName(@PathParam("societyCode") String societyCode) {
        return societyService.getBuildingNames(societyCode);
    }

    @RequestMapping(value = "/residentType")
    public List<String> getResidentTypes() {
        List<String> residentTypes = new ArrayList<>();
        residentTypes.add("GUEST");
        residentTypes.add("PERMANENT_CHILD");
        residentTypes.add("PERMANENT_ADULT");
        return residentTypes;
    }
}
