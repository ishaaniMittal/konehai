package com.konehai.service;

import com.konehai.dao.FloorPermissionDao;
import com.konehai.dao.UserDao;
import com.konehai.model.FloorPermission;
import com.konehai.model.AccessType;
import com.konehai.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by imittal on 2/15/17.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    FloorPermissionDao floorPermissionDao;

    public String registerNewUser(User user) {
        userDao.save(user);

        FloorPermission floorPermission = new FloorPermission();
        floorPermission.setFromUserId(user.getId());
        floorPermission.setFromBuildingNo(user.getBuildingNo());
        floorPermission.setFromHouseNo(user.getHouseNo());
        floorPermission.setPermissionType(AccessType.SELF.name());

        floorPermissionDao.save(floorPermission);

        return "User has been successfully registered";
    }

    public List<User> getHouseResidents(String buildingNo, String houseNo) {
        return userDao.getHouseResidents(buildingNo, houseNo);
    }
}
