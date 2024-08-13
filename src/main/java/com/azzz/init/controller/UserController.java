package com.azzz.init.controller;

import com.azzz.init.common.ApiResponse;
import com.azzz.init.common.ResultUtil;
import com.azzz.init.model.dto.user.UserLoginReq;
import com.azzz.init.model.dto.user.UserRegisterReq;
import com.azzz.init.model.vo.user.UserVO;
import com.azzz.init.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "用户服务")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "用户注册")
    @PostMapping("register")
    public ApiResponse<Long> userRegister(@RequestBody UserRegisterReq userRegisterReq){
        Long resp = userService.userRegister(userRegisterReq);
        return ResultUtil.success(resp);
    }

    @Operation(summary = "用户登录")
    @PostMapping("login")
    public ApiResponse<UserVO> userLogin(@RequestBody UserLoginReq userLoginReq){
        UserVO resp = userService.userLogin(userLoginReq);
        return ResultUtil.success(resp);
    }

}
