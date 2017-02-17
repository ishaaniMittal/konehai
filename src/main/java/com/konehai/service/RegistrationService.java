package com.konehai.service;

import com.konehai.dao.FloorPermissionDao;
import com.konehai.dao.RegistrationDao;
import com.konehai.model.FloorPermission;
import com.konehai.model.PermissionType;
import com.konehai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by imittal on 2/15/17.
 */
@Service
public class RegistrationService {
    @Autowired
    RegistrationDao registrationDao;
    @Autowired
    FloorPermissionDao floorPermissionDao;

    public String registerNewUser(User user) {
        registrationDao.save(user);

        FloorPermission floorPermission = new FloorPermission();
        floorPermission.setUserId(user.getId());
        floorPermission.setBuildingNo(user.getBuildingNo());
        floorPermission.setHouseNo(user.getHouseNo());
        floorPermission.setPermissionType(PermissionType.SELF.name());

        floorPermissionDao.save(floorPermission);

        return "User has been successfully registered";
    }
}
