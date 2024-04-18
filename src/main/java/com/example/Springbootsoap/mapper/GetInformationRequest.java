package com.example.Springbootsoap.mapper;

public class GetInformationRequest {

 private String username;
 private String password;
 private Integer serviceId;

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

    public Integer getServiceId() {
        return serviceId;
    }

    public void setGetServiceId(Integer getServiceId) {
        this.serviceId = getServiceId;
    }
}
