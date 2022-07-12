package com.springboot.springbootjpa.models.api.response;

import com.springboot.springbootjpa.models.db.Role;

public class PostRoleResponse {

    private String response;
    private RoleResponse role;

    public PostRoleResponse(Role role) {
        this.response = "OK";
        this.role = new RoleResponse(role);
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public RoleResponse getRole() {
        return role;
    }

    public void setRole(RoleResponse role) {
        this.role = role;
    }
}
