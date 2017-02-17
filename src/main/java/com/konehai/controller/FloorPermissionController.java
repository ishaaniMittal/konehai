package com.konehai.controller;

import com.konehai.model.FloorPermission;
import com.konehai.service.FloorPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@RequestMapping("/floorpermission")
@RestController
public class FloorPermissionController {

    @Autowired
    private FloorPermissionService floorPermissionService;

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public List<FloorPermission> getFloorsPermitted(@PathVariable int userId) {
        return floorPermissionService.getFloorsPermitted(userId);
    }

    @RequestMapping(value = "/invite", method = RequestMethod.POST)
    @ResponseBody
    public void inviteVisitor(@RequestBody FloorPermission floorPermission){
        floorPermissionService.addFloorPermission(floorPermission);
    }

    @RequestMapping(value = "/requestaccess", method = RequestMethod.POST)
    @ResponseBody
    public void requestFloorAccess(@RequestBody FloorPermission floorPermission){
        floorPermissionService.requestFloorAccess(floorPermission);
    }
}
