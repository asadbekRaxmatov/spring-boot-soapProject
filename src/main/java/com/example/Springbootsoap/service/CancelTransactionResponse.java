package com.example.Springbootsoap.service;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CancelTransactionResponse")
public class CancelTransactionResponse {

    @XmlElement(name = "result")
    protected CancelTransactionResult result;
}
