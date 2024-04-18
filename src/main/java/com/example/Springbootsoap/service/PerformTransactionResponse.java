package com.example.Springbootsoap.service;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PerformTransactionResponse")
public class PerformTransactionResponse {

    @XmlElement(name = "result")
    protected PerformTransactionResult result;
}
