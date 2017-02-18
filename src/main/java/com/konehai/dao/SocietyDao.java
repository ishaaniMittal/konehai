package com.konehai.dao;

import com.konehai.model.Society;
import com.konehai.response.BuildingNameResponse;
import com.konehai.response.HouseNameResponse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by imittal on 2/18/17.
 */
public interface SocietyDao extends CrudRepository<Society,Integer> {
    List<HouseNameResponse> findBySocietyCodeAndBuildingName(String societyCode, String buildingName);

    List<BuildingNameResponse> findBySocietyCode(String societyCode);
}
