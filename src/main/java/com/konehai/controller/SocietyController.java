package com.konehai.controller;

import com.konehai.response.SocietyNameResponse;
import com.konehai.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by imittal on 2/18/17.
 */
@RequestMapping("/society")
@RestController
public class SocietyController {

    @Autowired
    SocietyService societyService;

    @RequestMapping(value="/name")
    public List<SocietyNameResponse> getSocietyNames(){
        return societyService.getSocietyNames();
    }
}
