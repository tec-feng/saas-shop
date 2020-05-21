package com.sunny.shop.controller;
import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductDto;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.ProductAction;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author tec_feng
 * @create 2020-04-08 19:11
 */
@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    ProductAction productAction;
    @Autowired
    UserFeignApi userFeignApi;

    @PostMapping("/create")
    public ReturnResult create(ProductDto productDto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        return ReturnResult.success();
    }

}
