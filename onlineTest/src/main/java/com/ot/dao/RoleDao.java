package com.ot.dao;

import com.ot.model.Role;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface RoleDao extends Mapper<Role> {
    List<Role> findRoleByUserId(Integer userId);
}
