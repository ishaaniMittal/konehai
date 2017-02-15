package com.konehai.dao;

import com.konehai.model.OneTimeAccess;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@Transactional
public interface OneTimeAccessDao extends CrudRepository<OneTimeAccess,Integer> {

    List<OneTimeAccess> findByUserId(int userId);
}
