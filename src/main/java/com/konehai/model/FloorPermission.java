package com.konehai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by HP on 15-02-2017.
 */
@Entity
@Table(name = "floor_permission")
public class FloorPermission {
    @Id
    @Column(name = "user_id")
    private int userId;
    @Column(name = "permission_type")
    private PermissionType permissionType;
    @Column(name = "house_no")
    private int houseNo;
    @Column(name = "building_no")
    private String buildingNo;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public PermissionType getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionType permissionType) {
        this.permissionType = permissionType;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }
}
