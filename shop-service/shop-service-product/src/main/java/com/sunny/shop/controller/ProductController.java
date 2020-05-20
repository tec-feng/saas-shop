package com.sunny.shop.controller;
import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductDto;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
//import com.sunny.shop.service.user.api.UserFeignApi;
//import com.sunny.user.model.User;
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
//    ProductAction productAction;
//    @Autowired
//    UserFeignApi userFeignApi;

    @PostMapping("/create")
    public ReturnResult create(){
        SecurityContext ctx = SecurityContextHolder.getContext();
//        Authentication auth = ctx.getAuthentication();
//        User memberDetails = (User) auth.getPrincipal();
        return ReturnResult.success();
    }
//    @DeleteMapping("/delete/{id}")
//    public Object delete(@PathVariable("id")Integer id){
//        int i = productService.deleteByKey(id);
//        return i;
//    }
//
//    @PostMapping("/update/{id}")
//    public Object update(@PathVariable("id")Integer id, @RequestBody Product product){
//        productService.updateByKey(product);
//        return product;
//    }
//
//    @GetMapping("/{id}")
//    public Object get(@PathVariable("id")Integer id){
//        Product product = productService.selectByKey(id);
//        return product;
//    }
//
//    @GetMapping("/list")
//    public Object list(){
//        List<Product> products = productService.selectByExample(new ProductExample(), 0, 100);
//        return products;
//    }

}
