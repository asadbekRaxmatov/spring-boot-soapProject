package com.example.Springbootsoap.service;



import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CheckTransactionRequest")
public class CheckTransactionRequest {

    @XmlElement(name = "arguments")
    protected CheckTransactionArguments arguments;

    public CheckTransactionArguments getArguments() {
        return arguments;
    }

    public void setArguments(CheckTransactionArguments arguments) {
        this.arguments = arguments;
    }
}
