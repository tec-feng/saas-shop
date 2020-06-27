package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductUserCategoryMapper;
import com.sunny.product.model.ProductUserCategory;
import com.sunny.product.model.ProductUserCategoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-06-19 01:10:56
*/
@Service
public class ProductUserCategoryService extends BaseService<ProductUserCategory,ProductUserCategoryExample>{
    @Autowired
    ProductUserCategoryMapper productUserCategoryMapper;
    @Override
    protected BaseMapper<ProductUserCategory, ProductUserCategoryExample> getMapper() {
        return productUserCategoryMapper;
    }
}