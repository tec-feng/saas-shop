package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductCommentMapper;
import com.sunny.product.model.ProductComment;
import com.sunny.product.model.ProductCommentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:19:40
*/
@Service
public class ProductCommentService extends BaseService<ProductComment,ProductCommentExample>{
    @Autowired
    ProductCommentMapper productCommentMapper;
    @Override
    protected BaseMapper<ProductComment, ProductCommentExample> getMapper() {
        return productCommentMapper;
    }
}