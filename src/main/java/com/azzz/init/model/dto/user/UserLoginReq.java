package com.azzz.init.model.dto.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginReq implements Serializable {
    /**
     * 账号
     */
    private String useraccount;

    /**
     * 密码
     */
    private String userpassword;

    private static final long serialVersionUID = 1L;
}