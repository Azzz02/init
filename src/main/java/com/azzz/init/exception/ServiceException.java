package com.azzz.init.exception;

import com.azzz.init.common.ErrorCode;
import lombok.Getter;

/**
 * 自定义业务异常类
 */
@Getter
public class ServiceException extends RuntimeException{

    private final int code;

    public ServiceException(int code,String message){
        super(message);
        this.code = code;
    }

    public ServiceException(ErrorCode code){
        super(code.getMessage());
        this.code = code.getCode();
    }

    public ServiceException(ErrorCode errorCode,String message){
        super(message);
        this.code = errorCode.getCode();
    }

}
