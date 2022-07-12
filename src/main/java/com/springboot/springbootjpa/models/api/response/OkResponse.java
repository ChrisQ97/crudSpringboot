package com.springboot.springbootjpa.models.api.response;

public class OkResponse {

    private String response;

    public OkResponse() {
        this.response = "OK";
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
