package com.sunny.shop.service.product.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-service-product",fallback = ProductFeignFallBack.class)
public interface ProductFeignApi {

    @GetMapping(value = "/api/product/list")
    Object list();

}
