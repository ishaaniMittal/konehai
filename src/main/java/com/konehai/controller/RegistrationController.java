package com.konehai.controller;

import com.konehai.model.User;
import com.konehai.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by imittal on 2/15/17.
 */
@RequestMapping("/register")
@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String registerNewUser(@RequestBody User user) {
        return registrationService.registerNewUser(user);
    }


}
