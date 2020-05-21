package com.sunny.shop.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
import com.sunny.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-05-20 12:16:06
*/
@Component
public class ProductAction extends BaseAction<Product,ProductExample>{
    @Autowired
    ProductService productService;
    @Override
    protected BaseService<Product, ProductExample> getService() {
        return productService;
    }


}
