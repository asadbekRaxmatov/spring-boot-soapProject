package com.example.Springbootsoap.service;

import java.util.List;

public class InformationService {

    public List<Information> getInformation(long serviceId) {

        List<Information> informationList = List.of(
                new Information(1, "Information 1", "Description 1"),
                new Information(2, "Information 2", "Description 2"),
                new Information(3, "Information 3", "Description 3")
        );

        return informationList;
    }
}
