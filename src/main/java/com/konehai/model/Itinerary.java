package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by imittal on 2/15/17.
 */

@Entity
@Table(name = "user_itinerary")
public class Itinerary implements Serializable {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "user_itinerary_id")
    private int id;
    @Column(name = "from_floor")
    private String fromFloor;
    @Column(name = "to_floor")
    private String toFloor;
    @Column(name = "buildingNo")
    private String buildingNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromFloor() {
        return fromFloor;
    }

    public void setFromFloor(String fromFloor) {
        this.fromFloor = fromFloor;
    }

    public String getToFloor() {
        return toFloor;
    }

    public void setToFloor(String toFloor) {
        this.toFloor = toFloor;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }
}
