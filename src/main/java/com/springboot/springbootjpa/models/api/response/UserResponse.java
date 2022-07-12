package com.springboot.springbootjpa.models.api.response;

import com.springboot.springbootjpa.models.db.User;

import java.time.ZoneId;

public class UserResponse{

    private int id;
    private String name;
    private String userName;
    private int status;
    private Long ts_insert;

    public UserResponse(User userSaved) {
        this.id = userSaved.getId();
        this.name = userSaved.getName();
        this.userName = userSaved.getUserName();
        this.status = userSaved.getStatus();
        ZoneId zoneId = ZoneId.systemDefault();
        this.ts_insert = userSaved.getTs_insert().atZone(zoneId).toEpochSecond();
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getTs_insert() {
        return ts_insert;
    }

    public void setTs_insert(Long ts_insert) {
        this.ts_insert = ts_insert;
    }

    public UserResponse(String response, int id, String name, String userName, int status, Long ts_insert) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.status = status;
        this.ts_insert = ts_insert;
    }
}
