package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductNavCategoryDto;
import com.sunny.product.dto.ProductNavCategoryUpdateDto;
import com.sunny.product.model.ProductNavCategory;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.ProductNavCategoryAction;
import com.sunny.shop.common.ModelMapper;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author tec_feng
 * @create 2020-06-02 12:36
 */
@RestController
@RequestMapping(value = "/navCategory")
public class ProductNavCategoryController {
    @Autowired
    ProductNavCategoryAction navCategoryAction;
    @Autowired
    UserFeignApi userFeignApi;

    @PostMapping("/create")
    public ReturnResult create(ProductNavCategoryDto dto){
        userFeignApi.loadUserByUserName("sunny");
        ProductNavCategory navCategory = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategory.setUserId(loginUser.getId());
        navCategoryAction.save(navCategory);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(navCategory));
    }
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategoryAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ProductNavCategoryUpdateDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductNavCategory category = ModelMapper.INSTANCE.toModel(dto);
        category.setId(id);
        navCategoryAction.updateSelf(category,loginUser.getId());
        return ReturnResult.success(category);
    }

    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductNavCategory category = navCategoryAction.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @GetMapping
    public ReturnResult list(Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<ProductNavCategory> categories = navCategoryAction.listSelf(parentId, loginUser.getId(),page,pageSize);
        return ReturnResult.success(ModelMapper.INSTANCE.toVOs(categories));
    }
    @GetMapping("/list")
    public ReturnResult list1(Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        ReturnResult result = userFeignApi.loadUserByUserName("sunny");
        System.out.println(result);
        ReturnResult result1 = userFeignApi.getByUserName("sunny");
        System.out.println(result1);
        return ReturnResult.success();
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        List<ProductNavCategory> categories = navCategoryAction.listSelf(parentId, loginUser.getId(),page,pageSize);
//        return ReturnResult.success(ModelMapper.INSTANCE.toVOs(categories));
    }
}
