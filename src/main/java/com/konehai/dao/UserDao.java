package com.konehai.dao;

import com.konehai.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by imittal on 2/15/17.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {

    @Query("SELECT u FROM User u WHERE u.buildingNo = ?1 AND u.houseNo = ?2)")
    List<User> getHouseResidents(String buildingNo, String houseNo);
}
