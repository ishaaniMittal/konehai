package com.konehai.controller;

import com.konehai.model.OneTimeAccess;
import com.konehai.response.ActiveCodeRequest;
import com.konehai.service.OneTimeAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@RequestMapping("/onetimeaccess")
@RestController
public class OneTimeAccessController {

    @Autowired
    private OneTimeAccessService oneTimeAccessService;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public List<OneTimeAccess> getActiveCodes(@PathVariable int userId) {
        return oneTimeAccessService.getActiveCodes(userId);
    }

    @RequestMapping(value = "/generate/{userId}", method = RequestMethod.POST)
    @ResponseBody
    public void saveNewOneTimeAccessToken(@PathVariable int userId, @RequestBody OneTimeAccess oneTimeAccess){
        oneTimeAccessService.saveNewOneTimeAccessToken(userId, oneTimeAccess);
    }
}
