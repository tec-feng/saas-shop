package com.sunny.shop.service.user.api;

import com.sunny.base.ReturnResult;
import com.sunny.user.model.SecurityUserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "shop-service-user",fallback = UserFeignFallBack.class)
public interface UserFeignApi {

    /**
     * 通过用户名获取用户
     * @return
     */
    @GetMapping(value = "/api/user/getByUserName")
    ReturnResult getByUserName(@RequestParam("userName") String userName);

    /**
     * 通过用户名获取用户
     * @param userName  用户名
     * @return
     */
    @GetMapping(value = "/api/user/loadUserByUserName")
    ReturnResult<SecurityUserDetails> loadUserByUserName(@RequestParam("userName") String userName);
}
