package com.example.Springbootsoap.mapper;

import java.util.Map;

public class GetStatementRequest {

    private String password;
    private String username;
    private Map<String, String> parameters;
    private long serviceId;

    public GetStatementRequest(String password, String username, Map<String, String> parameters, long serviceId) {
        this.password = password;
        this.username = username;
        this.parameters = parameters;
        this.serviceId = serviceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }
}
