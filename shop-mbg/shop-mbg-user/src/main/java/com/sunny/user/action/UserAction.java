package com.sunny.user.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.user.model.User;
import com.sunny.user.model.UserExample;
import com.sunny.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-04-27 12:45
*/
@Component
public class UserAction extends BaseAction<User,UserExample>{
    @Autowired
    UserService userService;
    @Override
    protected BaseService<User, UserExample> getService() {
        return userService;
    }

    public User getByUserName(String userName){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        return getService().selectOne(example);
    }
}
