package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductNavCategoryDto;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.ProductCategoryAction;
import com.sunny.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tec_feng
 * @create 2020-06-02 12:36
 */
@RequestMapping(value = "productCategory")
public class ProductCategoryController {
    @Autowired
    ProductCategoryAction productCategoryAction;
    @PostMapping("/list")
    public ReturnResult list(ProductNavCategoryDto categoryDto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        return ReturnResult.success();
    }
}
