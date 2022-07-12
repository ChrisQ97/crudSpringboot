package com.springboot.springbootjpa.models.api.response;

import com.springboot.springbootjpa.models.db.Role;

public class RoleResponse {

    private int id;
    private String role_name;

    public RoleResponse(Role role) {
        this.id = role.getId();
        this.role_name = role.getRole_name();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
