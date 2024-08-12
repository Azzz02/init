package com.azzz.init.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponse<T> implements Serializable {

    private int code;
    private T data;
    private String message;

    public ApiResponse(int code,T data,String message){
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public ApiResponse(ErrorCode errorCode){
        this(errorCode.getCode(),null,errorCode.getMessage());
    }

}
