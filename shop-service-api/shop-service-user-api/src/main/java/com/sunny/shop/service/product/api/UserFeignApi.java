package com.sunny.shop.service.product.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-service-user",fallback = UserFeignFallBack.class)
public interface UserFeignApi {

    @GetMapping(value = "/user/list")
    Object list();

}
