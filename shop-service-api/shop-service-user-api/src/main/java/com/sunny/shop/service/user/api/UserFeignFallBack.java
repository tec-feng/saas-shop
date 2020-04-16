package com.sunny.shop.service.user.api;

public class UserFeignFallBack implements UserFeignApi{
    @Override
    public Object list() {
        return "aaaa";
    }
}
