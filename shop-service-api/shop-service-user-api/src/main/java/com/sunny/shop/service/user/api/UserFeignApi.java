package com.sunny.shop.service.user.api;

import com.sunny.base.ReturnResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-service-user",fallback = UserFeignFallBack.class)
public interface UserFeignApi {

    /**
     * 通过用户名获取用户
     * @param userName 用户名
     * @return
     */
    @GetMapping(value = "/api/user/getByUserName")
    ReturnResult getByUserName(String userName);

    /**
     * 通过用户名获取用户
     * @param userName  用户名
     * @return
     */
    @GetMapping(value = "/api/user/loadUserByUsername")
    ReturnResult loadUserByUsername(String userName);
}
