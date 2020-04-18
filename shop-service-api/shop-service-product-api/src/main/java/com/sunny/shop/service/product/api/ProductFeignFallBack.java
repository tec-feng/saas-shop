package com.sunny.shop.service.product.api;


import org.springframework.stereotype.Component;

@Component
public class ProductFeignFallBack implements ProductFeignApi {
    @Override
    public Object list() {
        return "aaaa";
    }
}
