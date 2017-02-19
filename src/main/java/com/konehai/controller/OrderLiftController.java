package com.konehai.controller;

import com.konehai.dao.FCMDao;
import com.konehai.model.FCMMessage;
import com.konehai.service.FCMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by imittal on 2/19/17.
 */
@RequestMapping("")
@RestController
public class OrderLiftController {

    RestTemplate template = new RestTemplate();

    @Autowired
    FCMService service;

    @Autowired
    FCMDao dao;

    @RequestMapping("/orderlift/{floorNumber}/{userId}")
    @ResponseBody
    public void orderlift(@PathVariable String floorNumber, @PathVariable String userId) {


        HttpEntity<String> response = template.exchange(
                "https://elevator-simulator-sbajaj-2140.mybluemix.net/orderliftlater?floor=" + floorNumber,
                HttpMethod.GET,
                null,
                String.class);

        try {
            service.pushFCMNotification(dao.findByUserId(userId).getDeviceId(), new FCMMessage("If you take the lift only till 2nd floor, you will burn an approx of 50 calories till your house", "Health Alert"));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
