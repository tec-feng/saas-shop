package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.CategoryProperty;
import com.sunny.product.model.CategoryPropertyExample;
import com.sunny.shop.service.CategoryPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Component
public class CategoryPropertyAction extends BaseAction<CategoryProperty,CategoryPropertyExample>{
    @Autowired
    CategoryPropertyService categoryPropertyService;
    @Override
    protected BaseService<CategoryProperty, CategoryPropertyExample> getService() {
        return categoryPropertyService;
    }
}
