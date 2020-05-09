package com.sunny.user.action;

import com.sunny.base.*;
import com.sunny.tools.UUIDUtils;
import com.sunny.user.dto.RegisterDto;
import com.sunny.user.model.User;
import com.sunny.user.model.UserExample;
import com.sunny.user.model.UserType;
import com.sunny.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
* @author tec_feng
* @create 2020-04-27 12:45
*/
@Component
public class UserAction extends BaseAction<User,UserExample>{
    @Autowired
    UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    protected BaseService<User, UserExample> getService() {
        return userService;
    }

    public User getByUserName(String userName){
        UserExample example = new UserExample();
        example.createCriteria().andUserNameEqualTo(userName);
        return getService().selectOne(example);
    }

    public ReturnResult register(RegisterDto user){
        if(!user.getPassword().equals(user.getConfirmPassword())){
            throw new ApiException(ApiCode.CONFIRM_PASSWORD_NOT_SAME);
        }
        User dbUser = getByUserName(user.getUserName());
        if(dbUser!=null){
            throw new ApiException(ApiCode.USER_EXIST);
        }
        User newUser = new User();
        BeanUtils.copyProperties(user,newUser);
        newUser.setId(UUIDUtils.uuid());
        newUser.setUserType(UserType.base.name());
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        newUser.setIcon(GlobalConstant.SYSTEM_LOGO);
        newUser.setHasForbidden(false);
        newUser.setStatus(false);
        newUser.setCreateTime(new Date());
        newUser.setUpdateTime(new Date());
        userService.save(newUser);
        return ReturnResult.success();
    }
}
