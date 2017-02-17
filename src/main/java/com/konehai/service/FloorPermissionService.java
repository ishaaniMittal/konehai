package com.konehai.service;

import com.konehai.dao.FloorPermissionDao;
import com.konehai.model.FloorPermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@Service
public class FloorPermissionService {

    @Autowired
    FloorPermissionDao floorPermissionDao;

    public List<FloorPermission> getFloorsPermitted(int userId) {
        return floorPermissionDao.findFloorsPermitted(userId);
    }

    public void addFloorPermission(List<FloorPermission> floorPermission) {
        floorPermissionDao.save(floorPermission);
    }

    public void requestFloorAccess(FloorPermission floorPermission) {
        floorPermissionDao.save(floorPermission);
    }
}
