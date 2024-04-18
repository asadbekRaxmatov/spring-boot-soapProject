package com.example.Springbootsoap.client.service;

import com.example.Springbootsoap.client.dto.ResponseDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;


@Service
public class SoapClient {
    private final WebServiceTemplate webServiceTemplate;

    public SoapClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public <E, T> ResponseDto<T> callSoap(@NonNull final E object) {
        return (ResponseDto<T>) webServiceTemplate.marshalSendAndReceive(object);
    }
}
