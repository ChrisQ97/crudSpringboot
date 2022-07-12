package com.springboot.springbootjpa.models.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUser {

    @JsonProperty
    private UserRequest user;

    public UserRequest getUser() {
        return user;
    }

    public void setUser(UserRequest user) {
        this.user = user;
    }
}
