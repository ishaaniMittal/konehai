package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by HP on 17-02-2017.
 */
@Entity
@Table(name="society")
public class Society {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="society_code")
    private String societyCode;
    @Column(name = "society_name")
    private String societyName;
    @Column(name = "building_name")
    private String buildingName;
    @Column(name = "house_name")
    private String houseName;

    public String getSocietyCode() {
        return societyCode;
    }

    public void setSocietyCode(String societyCode) {
        this.societyCode = societyCode;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }
}

