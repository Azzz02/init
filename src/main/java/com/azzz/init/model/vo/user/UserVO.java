package com.azzz.init.model.vo.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户脱敏信息
 */
@Data
public class UserVO implements Serializable {
    /**
     * 账号
     */
    private String useraccount;

    /**
     * 微信开放平台id
     */
    private String unionid;

    /**
     * 公众号openId
     */
    private String mpopenid;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 用户头像
     */
    private String useravatar;

    /**
     * 用户简介
     */
    private String userprofile;

    /**
     * 用户角色：user/admin/ban
     */
    private String userrole;


    private static final long serialVersionUID = 1L;
}