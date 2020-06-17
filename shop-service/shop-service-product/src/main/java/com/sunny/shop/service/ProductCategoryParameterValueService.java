package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductCategoryParameterValueMapper;
import com.sunny.product.model.ProductCategoryParameterValue;
import com.sunny.product.model.ProductCategoryParameterValueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Service
public class ProductCategoryParameterValueService extends BaseService<ProductCategoryParameterValue,ProductCategoryParameterValueExample>{
    @Autowired
    ProductCategoryParameterValueMapper productCategoryParameterValueMapper;
    @Override
    protected BaseMapper<ProductCategoryParameterValue, ProductCategoryParameterValueExample> getMapper() {
        return productCategoryParameterValueMapper;
    }
}