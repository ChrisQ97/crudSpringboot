package com.springboot.springbootjpa.models.api.request;

public class UserRequest {

    private String name;
    private String userName;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        this.userName = userName;
        this.password = password;
    }
}