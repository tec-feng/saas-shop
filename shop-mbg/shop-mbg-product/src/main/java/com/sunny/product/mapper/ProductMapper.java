package com.sunny.product.mapper;


import com.sunny.base.BaseMapper;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;

public interface ProductMapper  extends BaseMapper<Product,ProductExample> {
    Product getOtherMethod();
}