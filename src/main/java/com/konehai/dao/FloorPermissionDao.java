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
    @Query("SELECT * FROM floor_permission WHERE permission_type in ('ALLOW', 'SELF')")
    public List<FloorPermission> findFloorsPermitted(@Param("user_id") int userId);
}
