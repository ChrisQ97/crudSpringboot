package com.springboot.springbootjpa.models.db;

import com.springboot.springbootjpa.models.api.request.UserRequest;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "username")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private int status;
    @Column(name = "ts_insert")
    private LocalDateTime ts_insert;
    @Column(name = "role_id")
    private int role_id;

    public User(UserRequest user) {
        this.name = user.getName();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.status = 1;
        this.ts_insert = LocalDateTime.now();
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getTs_insert() {
        return ts_insert;
    }

    public void setTs_insert(LocalDateTime ts_insert) {
        this.ts_insert = ts_insert;
    }
}
