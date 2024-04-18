package com.example.Springbootsoap.service;


import com.example.Springbootsoap.mapper.GetInformationRequest;
import com.example.Springbootsoap.mapper.GetInformationResponse;
import com.example.Springbootsoap.mapper.InformationDetail;
import com.example.Springbootsoap.mapper.PerformTransactionRequest;
import com.example.Springbootsoap.mapper.PerformTransactionResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Springbootsoap.mapper.PerformTransactionResponse;


import java.time.LocalDateTime;
import java.util.List;

@WebService
public class ProviderWebService {
    @Autowired
    private TransactionService transactionService;
    @Autowired
    private InformationService informationService;
    @Autowired
    private UserService userService;

    @WebMethod
    public PerformTransactionResponse performTransaction(PerformTransactionRequest request) {
        PerformTransactionResponse response = new PerformTransactionResponse();
        if (request == null || request.getUsername() == null || request.getPassword() == null || request.getAmount() <= 0 || request.getTransactionId() <= 0 || request.getTransactionTime() == null || request.getServiceId() <= 0) {
            response.setErrorMsg("Invalid request parameters");
            response.setStatus(-1);
            return response;
        }

        if (!userService.authenticate(request.getUsername(), request.getPassword())) {
            response.setErrorMsg("Authentication failed");
            response.setStatus(-1);
            return response;
        }

        TransactionResult result = transactionService.processTransaction(request.getUsername(), request.getAmount(), request.getTransactionId(), request.getServiceId());

        response.setProviderTrnId(result.getProviderTransactionId());
        response.setStatus(result.isSuccess() ? 0 : -1);
        response.setErrorMsg(result.getErrorMessage());
        response.setTimeStamp(String.valueOf(LocalDateTime.now()));

        return response;
    }

    @WebMethod
    public GetInformationResponse getInformation(GetInformationRequest request) {

        GetInformationResponse response = new GetInformationResponse();

        if (request == null || request.getUsername() == null || request.getPassword() == null || request.getServiceId() <= 0) {
            response.setErrorMsg("Invalid request parameters");
            response.setStatus(-1);
            return response;
        }

        if (!userService.authenticate(request.getUsername(), request.getPassword())) {
            response.setErrorMsg("Authentication failed");
            response.setStatus(-1);
            return response;
        }

        List<Information> informationList = informationService.getInformation(request.getServiceId());

        if (informationList.isEmpty()) {
            response.setErrorMsg("No information found");
            response.setStatus(-1);
            return response;
        }

        for (Information info : informationList) {
            InformationDetail detail = new InformationDetail();
            detail.setId(info.getId());
            detail.setName(info.getName());
            detail.setDescription(info.getDescription());
            response.getInformationDetailDetails().add(detail);
        }

        response.setStatus(0);
        response.setErrorMsg("Success");
        response.setTimeStamp(String.valueOf(LocalDateTime.now()));

        return response;
    }
}
