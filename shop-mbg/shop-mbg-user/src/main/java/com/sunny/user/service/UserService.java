package com.sunny.user.service;/**
 * Created by tec_feng on 2020/4/11.
 * Email: tec_feng@hotmail.com
 */

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
 * @create 2020-04-11 13:28
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
