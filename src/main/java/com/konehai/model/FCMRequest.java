package com.konehai.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by imittal on 2/19/17.
 */
@Entity
@Table(name = "fcm_device_mapping")
public class FCMRequest {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    public int id;
    @Column(name = "device_id")
    private String deviceId;
    @Column(name = "userId")
    private String userId;

    public FCMRequest(String userId, String deviceId) {
        this.userId = userId;
        this.deviceId = deviceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FCMRequest() {
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
