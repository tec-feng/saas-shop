package com.sunny.product.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductProperty;
import com.sunny.product.model.ProductPropertyExample;
import com.sunny.product.service.ProductPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-04-27 12:45
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
