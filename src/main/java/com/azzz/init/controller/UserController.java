package com.azzz.init.controller;

import com.azzz.init.common.ApiResponse;
import com.azzz.init.common.ResultUtil;
import com.azzz.init.model.dto.user.UserLoginReq;
import com.azzz.init.model.dto.user.UserRegisterReq;
import com.azzz.init.model.vo.user.UserVO;
import com.azzz.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public ApiResponse<Long> userRegister(@RequestBody UserRegisterReq userRegisterReq){
        Long resp = userService.userRegister(userRegisterReq);
        return ResultUtil.success(resp);
    }

    @PostMapping("login")
    public ApiResponse<UserVO> userLogin(@RequestBody UserLoginReq userLoginReq){
        UserVO resp = userService.userLogin(userLoginReq);
        return ResultUtil.success(resp);
    }

}
