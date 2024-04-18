package com.example.Springbootsoap.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class ResponseDto<T> implements Serializable {
    private T data;
    private String error;
}
