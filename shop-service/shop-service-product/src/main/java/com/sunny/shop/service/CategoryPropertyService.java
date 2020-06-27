package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.CategoryPropertyMapper;
import com.sunny.product.model.CategoryProperty;
import com.sunny.product.model.CategoryPropertyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-06-22 07:48:04
*/
@Service
public class CategoryPropertyService extends BaseService<CategoryProperty,CategoryPropertyExample>{
    @Autowired
    CategoryPropertyMapper categoryPropertyMapper;
    @Override
    protected BaseMapper<CategoryProperty, CategoryPropertyExample> getMapper() {
        return categoryPropertyMapper;
    }
}