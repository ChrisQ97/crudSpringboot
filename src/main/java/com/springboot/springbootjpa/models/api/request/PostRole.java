package com.springboot.springbootjpa.models.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRole {

    @JsonProperty
    private RoleRequest role;

    public RoleRequest getRole() {
        return role;
    }

    public void setRole(RoleRequest role) {
        this.role = role;
    }
}
