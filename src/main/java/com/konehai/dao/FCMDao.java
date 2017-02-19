package com.konehai.dao;

import com.konehai.model.FCMRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by imittal on 2/19/17.
 */
@Transactional
public interface FCMDao extends CrudRepository<FCMRequest, Integer> {
    FCMRequest findByUserId(String userId);
}
