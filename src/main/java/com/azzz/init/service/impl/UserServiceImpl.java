package com.azzz.init.service.impl;

import cn.hutool.crypto.digest.DigestUtil;
import com.azzz.init.model.dto.user.UserLoginReq;
import com.azzz.init.model.dto.user.UserRegisterReq;
import com.azzz.init.model.entity.user.User;
import com.azzz.init.model.vo.user.UserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.azzz.init.service.UserService;
import com.azzz.init.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import static com.azzz.init.constant.UserConstant.DEFAULT_AVATAR_URL;
import static com.azzz.init.constant.UserConstant.DEFAULT_PROFILE;

/**
* @author admin
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2024-08-12 09:50:06
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{


    /**
     * 登录
     * @param userRegisterReq 注册请求类
     * @return
     */
    @Override
    public Long userRegister(UserRegisterReq userRegisterReq) {
        if(userRegisterReq == null){
            return null;
        }

        String userAccount = userRegisterReq.getUseraccount();
        String userPassword = userRegisterReq.getUserpassword();
        String checkPassword = userRegisterReq.getCheckPassword();
        //参数有误为空
        if(StringUtils.isAnyBlank(userAccount,userPassword,checkPassword)){
            return null;
        }

        //两次输入密码不一致
        if(!StringUtils.equals(userPassword,checkPassword)){
            return null;
        }
        String encryptPassword = DigestUtil.md5Hex(userPassword);

        User newUser = new User();
        newUser.setUseraccount(userAccount);
        newUser.setUserpassword(encryptPassword);
        newUser.setUsername(userAccount);
        newUser.setUseravatar(DEFAULT_AVATAR_URL);
        newUser.setUserprofile(DEFAULT_PROFILE);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount",userAccount);
        User oldUser = this.getOne(queryWrapper);
        if(oldUser != null){
            return null;
        }

        User user = this.getOne(queryWrapper);
        if(user != null){
            return null;
        }
        boolean save = this.save(newUser);
        if(!save){
            return null;
        }

        return newUser.getId();
    }

    /**
     * 登录
     * @param userLoginReq 登录请求类
     * @return
     */
    @Override
    public UserVO userLogin(UserLoginReq userLoginReq) {
        if(userLoginReq == null){
            return null;
        }

        String userAccount = userLoginReq.getUseraccount();
        String userPassword = userLoginReq.getUserpassword();

        if(StringUtils.isAnyBlank(userAccount,userPassword)){
            return null;
        }

        String encryptPassword = DigestUtil.md5Hex(userPassword);

        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userAccount",userAccount);
        queryWrapper.eq("userPassword",encryptPassword);

        User user = this.getOne(queryWrapper);
        if(user == null){
            return null;
        }

        UserVO userVo = new UserVO();
        BeanUtils.copyProperties(user,userVo);

        return userVo;
    }
}




