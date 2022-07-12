package com.springboot.springbootjpa.models.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUserRequest {

    @JsonProperty
    private PostUser request;

    public PostUser getRequest() {
        return request;
    }

    public void setRequest(PostUser request) {
        this.request = request;
    }
}
