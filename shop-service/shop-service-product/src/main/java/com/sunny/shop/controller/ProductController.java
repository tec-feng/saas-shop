package com.sunny.shop.controller;
import com.sunny.product.model.Product;
import com.sunny.product.model.ProductExample;
import com.sunny.product.service.ProductService;
import com.sunny.shop.service.product.api.UserFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
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
    ProductService productService;
    @Autowired
    UserFeignApi userFeignApi;

    @PostMapping("/create")
    public Object create(Product product){
        int insert = productService.save(product);
        return product;
    }
    @DeleteMapping("/delete/{id}")
    public Object delete(@PathVariable("id")Integer id){
        int i = productService.deleteByKey(id);
        return i;
    }

    @PostMapping("/update/{id}")
    public Object update(@PathVariable("id")Integer id, @RequestBody Product product){
        productService.updateByKey(product);
        return product;
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable("id")Integer id){
        Product product = productService.selectByKey(id);
        return product;
    }

    @GetMapping("/list")
    public Object list(){
        List<Product> products = productService.selectByExample(new ProductExample(), 0, 100);
        Object list = userFeignApi.list();
        return list;
    }


    @GetMapping("/list1")
    public Object list1(){
        return productService.getOtherMethod();
    }
}
