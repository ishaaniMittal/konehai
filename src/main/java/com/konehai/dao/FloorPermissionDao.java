package com.konehai.dao;

import com.konehai.model.FloorPermission;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HP on 15-02-2017.
 */
@Transactional
public interface FloorPermissionDao extends CrudRepository<FloorPermission,Integer> {
    @Query("SELECT fp FROM FloorPermission fp WHERE fp.userId = ?1 AND fp.permissionType in ('ALLOW','SELF'))")
    public List<FloorPermission> findFloorsPermitted(int userId);
}
