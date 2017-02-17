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
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int id;
    @Column(name = "from_user_id")
    private int fromUserId;
    @Column(name = "to_user_id")
    private int toUserId;
    @Column(name = "from_building_no")
    private String fromBuildingNo;
    @Column(name = "to_building_no")
    private String toBuildingNo;
    @Column(name = "from_house_no")
    private String fromHouseNo;
    @Column(name = "to_house_no")
    private String toHouseNo;
    @Column(name = "permission_type")
    private String permissionType;
    @Column(name = "house_no")
    private String houseNo;
    @Column(name = "building_no")
    private String buildingNo;

    public String getFromBuildingNo() {
        return fromBuildingNo;
    }

    public void setFromBuildingNo(String fromBuildingNo) {
        this.fromBuildingNo = fromBuildingNo;
    }

    public String getToBuildingNo() {
        return toBuildingNo;
    }

    public void setToBuildingNo(String toBuildingNo) {
        this.toBuildingNo = toBuildingNo;
    }

    public String getFromHouseNo() {
        return fromHouseNo;
    }

    public void setFromHouseNo(String fromHouseNo) {
        this.fromHouseNo = fromHouseNo;
    }

    public String getToHouseNo() {
        return toHouseNo;
    }

    public void setToHouseNo(String toHouseNo) {
        this.toHouseNo = toHouseNo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(int fromUserId) {
        this.fromUserId = fromUserId;
    }

    public int getToUserId() {
        return toUserId;
    }

    public void setToUserId(int toUserId) {
        this.toUserId = toUserId;
    }
}
