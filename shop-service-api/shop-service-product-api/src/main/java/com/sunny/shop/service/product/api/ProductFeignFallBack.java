package com.sunny.shop.service.product.api;

public class ProductFeignFallBack implements ProductFeignApi {
    @Override
    public Object list() {
        return "aaaa";
    }
}
