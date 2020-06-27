package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductUserCategoryDto;
import com.sunny.product.dto.ProductUserCategoryUpdateDto;
import com.sunny.product.model.ProductUserCategory;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.ProductUserCategoryAction;
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
 * @author tec_feng
 * @create 2020-06-02 12:36
 */
@Api(tags = "ProductUserCategoryController", description = "商品前台类目")
@RestController
@RequestMapping(value = "/userCategory")
public class ProductUserCategoryController {
    @Autowired
    ProductUserCategoryAction navCategoryAction;
    @Autowired
    UserFeignApi userFeignApi;

    @ApiOperation("创建用户商品分类")
    @PostMapping("/create")
    public ReturnResult create(@Valid ProductUserCategoryDto dto){
        ProductUserCategory navCategory = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategory.setUserId(loginUser.getId());
        navCategory.setAreaUserId(loginUser.getAreaUserId());
        navCategoryAction.save(navCategory);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(navCategory));
    }

    @ApiOperation("删除id的用户商品分类")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategoryAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的用户商品分类详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ProductUserCategoryUpdateDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductUserCategory category = ModelMapper.INSTANCE.toModel(dto);
        category.setId(id);
        navCategoryAction.updateSelf(category,loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("获取id的用户商品分类详情")
    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductUserCategory category = navCategoryAction.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("分页获取用户商品分类列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<ProductUserCategory> categories = navCategoryAction.listSelf(parentId, loginUser.getId(),page,pageSize);
        return ReturnResult.success(ModelMapper.INSTANCE.toUserCategoryVOs(categories));
    }
}
