package com.example.Springbootsoap.service;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CancelTransactionRequest")
public class CancelTransactionRequest {

    @XmlElement(name = "arguments")
    protected CancelTransactionArguments arguments;

    public CancelTransactionArguments getArguments() {
        return arguments;
    }

    public void setArguments(CancelTransactionArguments arguments) {
        this.arguments = arguments;
    }
}
