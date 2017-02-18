package com.konehai.controller;

import com.konehai.model.FCMMessage;
import com.konehai.service.FCMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by imittal on 2/19/17.
 */
@RestController
public class FCMController {
    @Autowired
    private FCMService service;

    @RequestMapping(value = "/register/user/{deviceId}", method = RequestMethod.POST)
    @ResponseBody
    public void sendNotificationToUser(@RequestBody FCMMessage message, @PathVariable String deviceId) {

        try {
            service.pushFCMNotification(deviceId, message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/saveToken/{userId}/{deviceId}")
    public void saveToken(@PathVariable("userId") String userId, @PathVariable("deviceId") String deviceId) {
        service.saveDeviceId(userId, deviceId);
    }

}
