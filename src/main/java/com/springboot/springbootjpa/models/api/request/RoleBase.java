package com.springboot.springbootjpa.models.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleBase {

    @JsonProperty
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
