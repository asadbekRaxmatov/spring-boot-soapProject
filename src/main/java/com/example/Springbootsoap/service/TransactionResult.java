package com.example.Springbootsoap.service;

import java.time.LocalDateTime;

public class TransactionResult {
    private boolean isSuccess;
    private long providerTransactionId;
    private String errorMessage;
    private LocalDateTime transactionTime;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setProviderTransactionId(long providerTransactionId) {
        this.providerTransactionId = providerTransactionId;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public long getProviderTransactionId() {
        return providerTransactionId;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime localDateTime) {
        this.transactionTime = localDateTime;
    }
}
