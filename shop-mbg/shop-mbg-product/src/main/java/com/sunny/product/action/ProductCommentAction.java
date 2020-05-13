package com.sunny.product.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductComment;
import com.sunny.product.model.ProductCommentExample;
import com.sunny.product.service.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* @author tec_feng
* @create 2020-04-27 12:45
*/
@Component
public class ProductCommentAction extends BaseAction<ProductComment,ProductCommentExample>{
    @Autowired
    ProductCommentService productCommentService;
    @Override
    protected BaseService<ProductComment, ProductCommentExample> getService() {
        return productCommentService;
    }
}
