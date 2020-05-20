package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductProperty;
import com.sunny.product.model.ProductPropertyExample;
import com.sunny.shop.service.ProductPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-20 12:20:06
*/
@Component
public class ProductPropertyAction extends BaseAction<ProductProperty,ProductPropertyExample>{
    @Autowired
    ProductPropertyService productPropertyService;
    @Override
    protected BaseService<ProductProperty, ProductPropertyExample> getService() {
        return productPropertyService;
    }
}
