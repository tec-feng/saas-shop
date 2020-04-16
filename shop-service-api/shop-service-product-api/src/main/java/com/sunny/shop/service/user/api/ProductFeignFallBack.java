package com.sunny.shop.service.user.api;

public class ProductFeignFallBack implements ProductFeignApi {
    @Override
    public Object list() {
        return "aaaa";
    }
}
