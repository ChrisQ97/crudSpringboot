package com.springboot.springbootjpa.models.api.response;

import com.springboot.springbootjpa.models.db.User;

public class PostUserResponse {
    private String response;
    private UserResponse user;

    public PostUserResponse(User user) {
        this.response = "OK";
        this.user = new UserResponse(user);
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public UserResponse getUser() {
        return user;
    }

    public void setUser(UserResponse user) {
        this.user = user;
    }
}
