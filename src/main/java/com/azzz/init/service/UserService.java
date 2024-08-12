package com.azzz.init.service;

import com.azzz.init.model.dto.user.UserLoginReq;
import com.azzz.init.model.dto.user.UserRegisterReq;
import com.azzz.init.model.entity.user.User;
import com.azzz.init.model.vo.user.UserVO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author admin
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-08-12 09:50:06
*/
public interface UserService extends IService<User> {

    /**
     * 用户登录
     * @param userLoginReq 登录请求类
     * @return 登录成功/失败
     */
    UserVO userLogin(UserLoginReq userLoginReq);

    /**
     * 用户注册
     * @param userRegisterReq 登录请求类
     * @return 登录成功/失败
     */
    Long userRegister(UserRegisterReq userRegisterReq);

}
