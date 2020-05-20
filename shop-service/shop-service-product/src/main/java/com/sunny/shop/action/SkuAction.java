package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.Sku;
import com.sunny.product.model.SkuExample;
import com.sunny.shop.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-20 12:20:30
*/
@Component
public class SkuAction extends BaseAction<Sku,SkuExample>{
    @Autowired
    SkuService skuService;
    @Override
    protected BaseService<Sku, SkuExample> getService() {
        return skuService;
    }
}
