package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductCategoryMapper;
import com.sunny.product.model.ProductCategory;
import com.sunny.product.model.ProductCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:19:26
*/
@Service
public class ProductCategoryService extends BaseService<ProductCategory,ProductCategoryExample>{
    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Override
    protected BaseMapper<ProductCategory, ProductCategoryExample> getMapper() {
        return productCategoryMapper;
    }
}