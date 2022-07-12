package com.springboot.springbootjpa.models.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRoleRequest {

    @JsonProperty
    private PostRole request;

    public PostRole getRequest() {
        return request;
    }

    public void setRequest(PostRole request) {
        this.request = request;
    }
}
