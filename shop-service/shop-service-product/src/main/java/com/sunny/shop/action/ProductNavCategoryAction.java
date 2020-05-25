package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductNavCategory;
import com.sunny.product.model.ProductNavCategoryExample;
import com.sunny.shop.service.ProductNavCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-25 01:05:16
*/
@Component
public class ProductNavCategoryAction extends BaseAction<ProductNavCategory,ProductNavCategoryExample>{
    @Autowired
    ProductNavCategoryService productNavCategoryService;
    @Override
    protected BaseService<ProductNavCategory, ProductNavCategoryExample> getService() {
        return productNavCategoryService;
    }
}
