package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductNavCategoryMapper;
import com.sunny.product.model.ProductNavCategory;
import com.sunny.product.model.ProductNavCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-25 01:05:16
*/
@Service
public class ProductNavCategoryService extends BaseService<ProductNavCategory,ProductNavCategoryExample>{
    @Autowired
    ProductNavCategoryMapper productNavCategoryMapper;
    @Override
    protected BaseMapper<ProductNavCategory, ProductNavCategoryExample> getMapper() {
        return productNavCategoryMapper;
    }
}