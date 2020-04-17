package com.sunny.shop.rpc;

import com.sunny.shop.service.product.api.ProductFeignApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductFeignController implements ProductFeignApi {

    @Override
    public Object list() {
        return null;
    }
}
