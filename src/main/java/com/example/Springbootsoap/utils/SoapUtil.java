package com.example.Springbootsoap.utils;


import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

@Log4j2
@Component
public class SoapUtil implements ClientInterceptor {
    private static final String WEB_SERVICE_CLIENT_EXCEPTION_MESSAGE = "#error in(SoapInterceptor) details(errorMessage=(%s))";

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {

        writeMessageToBuffer.accept(messageContext.getRequest());

        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
         writeMessageToBuffer.accept(messageContext.getResponse());

        return true;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
         writeMessageToBuffer.accept(messageContext.getResponse());

        return true;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {

    }

    // ------------------------------------ HELPER METHODS ------------------------------------
    private final Consumer<WebServiceMessage> writeMessageToBuffer = (message) -> {
        try {
            var baos = new ByteArrayOutputStream();
            message.writeTo(baos);

//            log.info(baos.toString(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new WebServiceClientException(String.format(WEB_SERVICE_CLIENT_EXCEPTION_MESSAGE, e.getMessage()), e) {
            };
        }
    };


}