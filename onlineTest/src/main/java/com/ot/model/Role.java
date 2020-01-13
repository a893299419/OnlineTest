package com.ot.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class Role {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer roleId;
    private String roleName;
    private String roleDesc;
    private List<Permssion> permissions;

    public List<Permssion> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permssion> permissions) {
        this.permissions = permissions;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
