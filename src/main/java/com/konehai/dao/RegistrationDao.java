package com.konehai.dao;

import com.konehai.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by imittal on 2/15/17.
 */
@Transactional
public interface RegistrationDao extends CrudRepository<User,Integer> {


}
