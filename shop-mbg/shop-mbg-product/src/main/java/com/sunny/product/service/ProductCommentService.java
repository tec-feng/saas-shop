package com.sunny.product.service;

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
* @create 2020-04-11 13:28
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