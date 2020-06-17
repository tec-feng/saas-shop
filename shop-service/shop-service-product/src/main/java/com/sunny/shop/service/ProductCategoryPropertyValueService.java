package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductCategoryPropertyValueMapper;
import com.sunny.product.model.ProductCategoryPropertyValue;
import com.sunny.product.model.ProductCategoryPropertyValueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Service
public class ProductCategoryPropertyValueService extends BaseService<ProductCategoryPropertyValue,ProductCategoryPropertyValueExample>{
    @Autowired
    ProductCategoryPropertyValueMapper productCategoryPropertyValueMapper;
    @Override
    protected BaseMapper<ProductCategoryPropertyValue, ProductCategoryPropertyValueExample> getMapper() {
        return productCategoryPropertyValueMapper;
    }
}