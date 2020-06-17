package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductCategoryParameterValue;
import com.sunny.product.model.ProductCategoryParameterValueExample;
import com.sunny.shop.service.ProductCategoryParameterValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Component
public class ProductCategoryParameterValueAction extends BaseAction<ProductCategoryParameterValue,ProductCategoryParameterValueExample>{
    @Autowired
    ProductCategoryParameterValueService productCategoryParameterValueService;
    @Override
    protected BaseService<ProductCategoryParameterValue, ProductCategoryParameterValueExample> getService() {
        return productCategoryParameterValueService;
    }
}
