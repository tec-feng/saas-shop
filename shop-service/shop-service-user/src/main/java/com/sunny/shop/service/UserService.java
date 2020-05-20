package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.user.mapper.UserMapper;
import com.sunny.user.model.User;
import com.sunny.user.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 01:43:58
*/
@Service
public class UserService extends BaseService<User,UserExample>{
    @Autowired
    UserMapper userMapper;
    @Override
    protected BaseMapper<User, UserExample> getMapper() {
        return userMapper;
    }
}