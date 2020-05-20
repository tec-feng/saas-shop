package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductPropertyMapper;
import com.sunny.product.model.ProductProperty;
import com.sunny.product.model.ProductPropertyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:20:06
*/
@Service
public class ProductPropertyService extends BaseService<ProductProperty,ProductPropertyExample>{
    @Autowired
    ProductPropertyMapper productPropertyMapper;
    @Override
    protected BaseMapper<ProductProperty, ProductPropertyExample> getMapper() {
        return productPropertyMapper;
    }
}