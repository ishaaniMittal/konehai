package com.konehai.service;

import com.konehai.dao.OneTimeAccessDao;
import com.konehai.model.OneTimeAccess;
import com.konehai.response.ActiveCodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@Service
public class OneTimeAccessService {
    @Autowired
    OneTimeAccessDao oneTimeAccessDao;

    public List<OneTimeAccess> getActiveCodes(int userId) {
        return oneTimeAccessDao.findByUserId(userId);
    }

    public void saveNewOneTimeAccessToken(int userId, OneTimeAccess oneTimeAccess) {
        oneTimeAccessDao.save(oneTimeAccess);
    }
}
