package com.konehai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HP on 15-02-2017.
 */
@Entity
@Table(name = "floor_permission")
public class FloorPermission {
    @Column(name = "user_id")
    private int userId;
    @Column(name = "permission_type")
    private PermissionType permissionType;
    @Column(name = "floor_no")
    private int floorNo;
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

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }
}
