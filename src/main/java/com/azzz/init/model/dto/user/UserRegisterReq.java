package com.azzz.init.model.dto.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterReq implements Serializable {
    /**
     * 账号
     */
    private String useraccount;

    /**
     * 密码
     */
    private String userpassword;

    /**
     * 确认密码
     */
    private String checkPassword;

    private static final long serialVersionUID = 1L;
}