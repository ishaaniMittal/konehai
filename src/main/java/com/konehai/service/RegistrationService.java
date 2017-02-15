package com.konehai.service;

import com.konehai.dao.RegistrationDao;
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

    public String registerNewUser(User user) {
        registrationDao.save(user);
        return "User has been successfully registered";
    }
}
