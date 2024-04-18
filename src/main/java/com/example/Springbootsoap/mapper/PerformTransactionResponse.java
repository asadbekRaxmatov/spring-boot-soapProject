package com.example.Springbootsoap.mapper;

import java.util.Map;

public class PerformTransactionResponse {

    private String errorMsg;
    private int status;
    private String timeStamp;
    private Map<String, String> parameters;
    private long providerTrnId;


//    public PerformTransactionResponse(String errorMsg, int status, String timeStamp, Map<String, String> parameters, long providerTrnId) {
//        this.errorMsg = errorMsg;
//        this.status = status;
//        this.timeStamp = timeStamp;
//        this.parameters = parameters;
//        this.providerTrnId = providerTrnId;
//    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public long getProviderTrnId() {
        return providerTrnId;
    }

    public void setProviderTrnId(long providerTrnId) {
        this.providerTrnId = providerTrnId;
    }
}
