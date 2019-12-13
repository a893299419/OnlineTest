package com.ot.dao;

import com.ot.model.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RoleDao {
    List<Role> findRoleByUserId(Integer userId);
}
