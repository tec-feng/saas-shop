package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductCategoryPropertyValue;
import com.sunny.product.model.ProductCategoryPropertyValueExample;
import com.sunny.shop.service.ProductCategoryPropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Component
public class ProductCategoryPropertyValueAction extends BaseAction<ProductCategoryPropertyValue,ProductCategoryPropertyValueExample>{
    @Autowired
    ProductCategoryPropertyValueService productCategoryPropertyValueService;
    @Override
    protected BaseService<ProductCategoryPropertyValue, ProductCategoryPropertyValueExample> getService() {
        return productCategoryPropertyValueService;
    }
}
