package com.example.Springbootsoap.service;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CheckTransactionResponse")
public class CheckTransactionResponse {

    @XmlElement(name = "result")
    protected CheckTransactionResult result;
}
