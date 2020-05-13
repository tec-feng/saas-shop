package com.sunny.product.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductCommentReply;
import com.sunny.product.model.ProductCommentReplyExample;
import com.sunny.product.service.ProductCommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-04-27 12:45
*/
@Component
public class ProductCommentReplyAction extends BaseAction<ProductCommentReply,ProductCommentReplyExample>{
    @Autowired
    ProductCommentReplyService productCommentReplyService;
    @Override
    protected BaseService<ProductCommentReply, ProductCommentReplyExample> getService() {
        return productCommentReplyService;
    }
}
