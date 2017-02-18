package com.konehai.service;

import com.konehai.dao.FloorPermissionDao;
import com.konehai.model.FloorPermission;
import com.konehai.model.enums.AccessType;
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

    public void allowRequestedFloorAccess(FloorPermission floorPermission) {
        FloorPermission newFloorPermitted = new FloorPermission();
        newFloorPermitted.setFromUserId(floorPermission.getToUserId());
        newFloorPermitted.setFromBuildingNo(floorPermission.getToBuildingNo());
        newFloorPermitted.setFromHouseNo(floorPermission.getToHouseNo());

        newFloorPermitted.setToUserId(floorPermission.getFromUserId());
        newFloorPermitted.setToBuildingNo(floorPermission.getFromBuildingNo());
        newFloorPermitted.setToHouseNo(floorPermission.getFromHouseNo());
        newFloorPermitted.setPermissionType(AccessType.ALLOWED.name());

        floorPermissionDao.save(newFloorPermitted);
        floorPermissionDao.delete(floorPermission);
    }
}
