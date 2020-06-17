package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.CategoryParameterMapper;
import com.sunny.product.model.CategoryParameter;
import com.sunny.product.model.CategoryParameterExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Service
public class CategoryParameterService extends BaseService<CategoryParameter,CategoryParameterExample>{
    @Autowired
    CategoryParameterMapper categoryParameterMapper;
    @Override
    protected BaseMapper<CategoryParameter, CategoryParameterExample> getMapper() {
        return categoryParameterMapper;
    }
}