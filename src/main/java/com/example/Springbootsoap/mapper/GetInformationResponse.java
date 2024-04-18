package com.example.Springbootsoap.mapper;

import java.util.Map;

public class GetInformationResponse {

    private String errorMsg;
    private int status;
    private String timeStamp;
    private Map<String, String> parameters;
    private InformationDetail informationDetail;

//    public GetInformationResponse(String errorMsg, int status, String timeStamp, Map<String, String> parameters) {
//        this.errorMsg = errorMsg;
//        this.status = status;
//        this.timeStamp = timeStamp;
//        this.parameters = parameters;
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

    public InformationDetail getInformationDetailDetails() {
        return informationDetail;
    }

    public void setInformationDetailDetails(InformationDetail details) {
        this.informationDetail = details;
    }
}
