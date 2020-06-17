package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductCategoryDto;
import com.sunny.product.dto.ProductCategoryUpdateDto;
import com.sunny.product.model.ProductCategory;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.ProductCategoryAction;
import com.sunny.shop.common.ModelMapper;
import com.sunny.shop.service.user.api.UserFeignApi;
import com.sunny.user.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 区域管理员设置商品后台类目
 * @author tec_feng
 * @create 2020-06-02 12:36
 */
@Api(tags = "ProductCategoryController", description = "商品后台类目")
@RestController
@RequestMapping(value = "productCategory")
public class ProductCategoryController {
    @Autowired
    ProductCategoryAction categoryAction;
    @Autowired
    UserFeignApi userFeignApi;

    @ApiOperation("创建后台类目")
    @PostMapping("/create")
    public ReturnResult create(@Valid ProductCategoryDto dto){
        ProductCategory navCategory = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategory.setAreaUserId(loginUser.getAreaUserId());
        navCategory.setAreaUserId(loginUser.getId());
        categoryAction.save(navCategory);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(navCategory));
    }

    @ApiOperation("删除id的后台类目")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        categoryAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的后台类目详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ProductCategoryUpdateDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductCategory category = ModelMapper.INSTANCE.toModel(dto);
        category.setId(id);
        categoryAction.updateSelf(category,loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("获取id的后台类目详情")
    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductCategory category = categoryAction.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("分页获取后台类目列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<ProductCategory> categories = categoryAction.listSelf(parentId, loginUser.getId(),page,pageSize);
        return ReturnResult.success(ModelMapper.INSTANCE.toCategoryVOs(categories));
    }
}
