package com.sunny.shop.service.user.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-service-user",fallback = UserFeignFallBack.class)
public interface UserFeignApi {

    @GetMapping(value = "/api/user/list")
    Object list();

}
