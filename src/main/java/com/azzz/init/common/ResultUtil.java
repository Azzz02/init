package com.azzz.init.common;

import com.azzz.init.model.vo.user.UserVO;
import org.apache.poi.ss.formula.functions.T;

public class ResultUtil {

    public static<T> ApiResponse<T> success(T data){
        return new ApiResponse<>(0,data,"ok");
    }

    /**
     * 错误
     * @param errorCode
     * @return
     */
    public static<T> ApiResponse<T> error(ErrorCode errorCode){
        return new ApiResponse<>(errorCode);
    }
    public static<T> ApiResponse<T> error(int code,String message){
        return new ApiResponse<>(code,null,message);
    }
    public static<T> ApiResponse<T> error(ErrorCode errorCode,String message){
        return new ApiResponse<>(errorCode.getCode(),null,message);
    }

}
