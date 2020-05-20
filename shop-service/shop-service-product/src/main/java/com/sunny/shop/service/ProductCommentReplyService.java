package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.ProductCommentReplyMapper;
import com.sunny.product.model.ProductCommentReply;
import com.sunny.product.model.ProductCommentReplyExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:19:52
*/
@Service
public class ProductCommentReplyService extends BaseService<ProductCommentReply,ProductCommentReplyExample>{
    @Autowired
    ProductCommentReplyMapper productCommentReplyMapper;
    @Override
    protected BaseMapper<ProductCommentReply, ProductCommentReplyExample> getMapper() {
        return productCommentReplyMapper;
    }
}