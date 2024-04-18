package com.example.Springbootsoap.service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.time.LocalDateTime;

@WebService
public class TransactionService {

    public TransactionResult processTransaction(String username, long amount, long transactionId, long serviceId) {

        TransactionResult result = new TransactionResult();

        result.setProviderTransactionId(123456);
        result.setSuccess(true);
        result.setErrorMessage("No errors");

        LocalDateTime now = LocalDateTime.now();
        result.setTransactionTime(now);

        return result;
    }

    @WebMethod
    public PerformTransactionResult performTransaction(PerformTransactionArguments arguments) {
        return null;
    }

    @WebMethod
    public CheckTransactionResult checkTransaction(CheckTransactionArguments arguments) {
        return null;
    }
}
