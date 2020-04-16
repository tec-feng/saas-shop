package com.sunny.shop.rpc;

import com.sunny.shop.service.product.api.ProductFeignApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductFeignController implements ProductFeignApi {

    @Override
    public Object list() {
        return null;
    }
}
