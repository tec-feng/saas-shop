package com.sunny.shop.service.user.api;


import com.sunny.base.ReturnResult;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallBack implements UserFeignApi{

    @Override
    public ReturnResult getByUserName(String userName) {
        return null;
    }

    @Override
    public ReturnResult loadUserByUserName(String userName) {
        return null;
    }

}
