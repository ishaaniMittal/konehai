package com.konehai.controller;

import com.konehai.model.User;
import com.konehai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by imittal on 2/15/17.
 */
@RequestMapping("")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register/user", method = RequestMethod.POST)
    @ResponseBody
    public String registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @RequestMapping(value = "/residents", method = RequestMethod.GET)
    public List<User> getResidentsOfAHouse(@RequestParam("buildingNo") String buildingNo, @RequestParam("houseNo") String houseNo) {
        return userService.getHouseResidents(buildingNo, houseNo);
    }
}
