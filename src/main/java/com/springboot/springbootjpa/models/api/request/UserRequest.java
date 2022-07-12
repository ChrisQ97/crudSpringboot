package com.springboot.springbootjpa.models.api.request;

public class UserRequest {

    private String name;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRequest() {
    }

    public UserRequest(String name, String userName, String password) {
        this.name = name;
        this.username = userName;
        this.password = password;
    }
}
