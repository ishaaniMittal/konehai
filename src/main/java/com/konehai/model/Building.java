package com.konehai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by HP on 18-02-2017.
 */
@Entity
@Table(name="building")
public class Building {
    @Id
    @Column(name = "building_id")
    private int buildingId;
    @Column(name = "building_name")
    private String buildingName;
    @Column(name = "society_code")
    private String societyCode;
    @Column(name = "house_id")
    private int houseId;
    @Column(name = "house_name")
    private String houseName;

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getSocietyCode() {
        return societyCode;
    }

    public void setSocietyCode(String societyCode) {
        this.societyCode = societyCode;
    }

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}
