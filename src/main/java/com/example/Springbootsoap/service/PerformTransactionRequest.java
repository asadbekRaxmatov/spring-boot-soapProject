package com.example.Springbootsoap.service;



import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PerformTransactionRequest")
public class PerformTransactionRequest {

    @XmlElement(name = "arguments")
    protected PerformTransactionArguments arguments;

    public PerformTransactionArguments getArguments() {
        return arguments;
    }

    public void setArguments(PerformTransactionArguments arguments) {
        this.arguments = arguments;
    }
}
