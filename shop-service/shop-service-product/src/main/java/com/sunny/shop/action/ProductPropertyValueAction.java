package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductPropertyValue;
import com.sunny.product.model.ProductPropertyValueExample;
import com.sunny.shop.service.ProductPropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-20 12:20:18
*/
@Component
public class ProductPropertyValueAction extends BaseAction<ProductPropertyValue,ProductPropertyValueExample>{
    @Autowired
    ProductPropertyValueService productPropertyValueService;
    @Override
    protected BaseService<ProductPropertyValue, ProductPropertyValueExample> getService() {
        return productPropertyValueService;
    }
}
