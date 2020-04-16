package com.sunny.shop.service.product.api;

public class UserFeignFallBack implements UserFeignApi{
    @Override
    public Object list() {
        return "aaaa";
    }
}
