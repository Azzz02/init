package com.azzz.init.exception;

import com.azzz.init.common.ApiResponse;
import com.azzz.init.common.ErrorCode;
import com.azzz.init.common.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandle {

    @ExceptionHandler(ServiceException.class)
    public ApiResponse<?> serviceExceptionHandler(ServiceException e){
        log.error("ServiceException",e);
        return ResultUtil.error(e.getCode(),e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public ApiResponse<?> runtimeExceptionHandler(RuntimeException e){
        log.error("RuntimeException",e);
        return ResultUtil.error(ErrorCode.SYSTEM_ERROR,ErrorCode.SYSTEM_ERROR.getMessage());
    }

}
