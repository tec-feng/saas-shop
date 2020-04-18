package com.sunny.shop.service.user.api;


import org.springframework.stereotype.Component;

@Component
public class UserFeignFallBack implements UserFeignApi{
    @Override
    public Object list() {
        return "aaaa";
    }
}
