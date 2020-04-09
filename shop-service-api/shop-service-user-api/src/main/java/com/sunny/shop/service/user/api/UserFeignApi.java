package com.sunny.shop.service.user.api;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "paascloud-provider-mdc",fallback = UserFeignFallBack.class)
public interface UserFeignApi {
}
