package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductMapper;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:16:06
*/
@Service
public class ProductService extends BaseService<Product,ProductExample>{
    @Autowired
    ProductMapper productMapper;
    @Override
    protected BaseMapper<Product, ProductExample> getMapper() {
        return productMapper;
    }
}