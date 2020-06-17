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
@Api(tags = "ProductNavCategoryController", description = "商品前台类目")
@RestController
@RequestMapping(value = "/navCategory")
public class ProductNavCategoryController {
    @Autowired
    ProductNavCategoryAction navCategoryAction;
    @Autowired
    UserFeignApi userFeignApi;

    @ApiOperation("创建前台类目")
    @PostMapping("/create")
    public ReturnResult create(@Valid ProductNavCategoryDto dto){
        ProductNavCategory navCategory = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategory.setUserId(loginUser.getId());
        navCategory.setAreaUserId(loginUser.getAreaUserId());
        navCategoryAction.save(navCategory);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(navCategory));
    }

    @ApiOperation("删除id的前台类目")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        navCategoryAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的前台类目详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ProductNavCategoryUpdateDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductNavCategory category = ModelMapper.INSTANCE.toModel(dto);
        category.setId(id);
        navCategoryAction.updateSelf(category,loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("获取id的前台类目详情")
    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ProductNavCategory category = navCategoryAction.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
    }

    @ApiOperation("分页获取前台类目列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<ProductNavCategory> categories = navCategoryAction.listSelf(parentId, loginUser.getId(),page,pageSize);
        return ReturnResult.success(ModelMapper.INSTANCE.toNavCategoryVOs(categories));
    }
}
