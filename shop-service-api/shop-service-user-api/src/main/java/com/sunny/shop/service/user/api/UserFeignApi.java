package com.sunny.shop.service.user.api;

@FeignClient(value = "paascloud-provider-mdc",fallback = UserFeignFallBack.class)
public interface UserFeignApi {
}
