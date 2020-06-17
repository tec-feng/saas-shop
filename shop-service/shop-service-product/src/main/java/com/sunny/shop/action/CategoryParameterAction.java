package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.CategoryParameter;
import com.sunny.product.model.CategoryParameterExample;
import com.sunny.shop.service.CategoryParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Component
public class CategoryParameterAction extends BaseAction<CategoryParameter,CategoryParameterExample>{
    @Autowired
    CategoryParameterService categoryParameterService;
    @Override
    protected BaseService<CategoryParameter, CategoryParameterExample> getService() {
        return categoryParameterService;
    }
}
