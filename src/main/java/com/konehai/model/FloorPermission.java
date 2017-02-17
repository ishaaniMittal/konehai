package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by HP on 15-02-2017.
 */
@Entity
@Table(name = "floor_permission")
public class FloorPermission {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id")
    private int id;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "permission_type")
    private String permissionType;
    @Column(name = "house_no")
    private String houseNo;
    @Column(name = "building_no")
    private String buildingNo;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }
}
