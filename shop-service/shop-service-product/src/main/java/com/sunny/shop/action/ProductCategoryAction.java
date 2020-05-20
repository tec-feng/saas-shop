package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductCategory;
import com.sunny.product.model.ProductCategoryExample;
import com.sunny.shop.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-20 12:19:27
*/
@Component
public class ProductCategoryAction extends BaseAction<ProductCategory,ProductCategoryExample>{
    @Autowired
    ProductCategoryService productCategoryService;
    @Override
    protected BaseService<ProductCategory, ProductCategoryExample> getService() {
        return productCategoryService;
    }
}
