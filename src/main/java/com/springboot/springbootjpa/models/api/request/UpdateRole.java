package com.springboot.springbootjpa.models.api.request;

public class UpdateRole {

    private UserBase user;
    private RoleBase role;

    public UserBase getUser() {
        return user;
    }

    public void setUser(UserBase user) {
        this.user = user;
    }

    public RoleBase getRole() {
        return role;
    }

    public void setRole(RoleBase role) {
        this.role = role;
    }
}
