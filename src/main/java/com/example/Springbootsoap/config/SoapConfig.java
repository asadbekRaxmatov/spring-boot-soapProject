package com.example.Springbootsoap.config;

import com.example.Springbootsoap.config.data.SoapConfigData;
import com.example.Springbootsoap.utils.SoapUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.WebServiceMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapConfig {
    private final SoapUtil soapUtil;
    private final SoapConfigData soapConfig;

    public SoapConfig(SoapUtil soapUtil, SoapConfigData soapConfig) {
        this.soapUtil = soapUtil;
        this.soapConfig = soapConfig;
    }

    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan("uz.rahmatov.app.client.dto.generated");
        return jaxb2Marshaller;
    }

    public WebServiceMessageSender defaultMessageSenders() {


        var httpComponentsMessageSender = new HttpComponentsMessageSender();


        httpComponentsMessageSender.setReadTimeout(soapConfig.getConnectTimeoutMs());
        httpComponentsMessageSender.setConnectionTimeout(soapConfig.getConnectTimeoutMs());


        return httpComponentsMessageSender;
    }

   @Bean
   public WebServiceTemplate webServiceTemplate() {
      WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
      webServiceTemplate.setMarshaller(marshaller());
      webServiceTemplate.setUnmarshaller(marshaller());

      webServiceTemplate.setDefaultUri(soapConfig.getUrl());

      ClientInterceptor[] interceptors = new ClientInterceptor[]{soapUtil};

      webServiceTemplate.setMessageSenders(new WebServiceMessageSender[]{defaultMessageSenders()});

      webServiceTemplate.setInterceptors(interceptors);
      return webServiceTemplate;
   }
}
