package com.example.Springbootsoap.mapper;

import java.util.Map;

public class PerformTransactionRequest {

    private String password;
    private String username;
    private long amount;
    private Map<String, String> parameters;
    private long serviceId;
    private long transactionId;
    private String transactionTime;

    public PerformTransactionRequest(String password, String username, long amount, Map<String, String> parameters, long serviceId, long transactionId, String transactionTime) {
        this.password = password;
        this.username = username;
        this.amount = amount;
        this.parameters = parameters;
        this.serviceId = serviceId;
        this.transactionId = transactionId;
        this.transactionTime = transactionTime;
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

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
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

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }
}
