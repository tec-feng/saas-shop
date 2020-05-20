package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductPropertyValueMapper;
import com.sunny.product.model.ProductPropertyValue;
import com.sunny.product.model.ProductPropertyValueExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:20:18
*/
@Service
public class ProductPropertyValueService extends BaseService<ProductPropertyValue,ProductPropertyValueExample>{
    @Autowired
    ProductPropertyValueMapper productPropertyValueMapper;
    @Override
    protected BaseMapper<ProductPropertyValue, ProductPropertyValueExample> getMapper() {
        return productPropertyValueMapper;
    }
}