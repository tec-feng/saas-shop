package com.sunny.user.mapper;
import com.sunny.base.BaseMapper;
import com.sunny.user.model.User;
import com.sunny.user.model.UserExample;

/**
* @author tec_feng
* @create 2020-04-08 19:11
*/
public interface UserMapper extends BaseMapper<User,UserExample> {

    User getOtherMethod();
}