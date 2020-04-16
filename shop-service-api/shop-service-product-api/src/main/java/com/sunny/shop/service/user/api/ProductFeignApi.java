package com.sunny.shop.service.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-service-product",fallback = ProductFeignFallBack.class)
public interface ProductFeignApi {

    @GetMapping(value = "/product/list")
    Object list();

}
