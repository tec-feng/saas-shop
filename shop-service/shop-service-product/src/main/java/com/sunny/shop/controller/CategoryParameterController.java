package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.ProductCategoryDto;
import com.sunny.product.dto.ProductCategoryUpdateDto;
import com.sunny.product.model.ProductCategory;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.CategoryParameterAction;
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
 * 区域管理员设置分类属性参数
 * @author tec_feng
 * @create 2020-06-17 12:36
 */
@Api(tags = "CategoryParameterController", description = "分类属性参数")
@RestController
@RequestMapping(value = "categoryParameter")
public class CategoryParameterController {
    @Autowired
    CategoryParameterAction parameterAction;
    @Autowired
    UserFeignApi userFeignApi;
    //todo   需要考虑如果摸个商品分类属性值被删除了，怎么办呢？需要冗余备份？还是如何处理
    @ApiOperation("创建分类属性参数")
    @PostMapping("/create")
    public ReturnResult create(@Valid ProductCategoryDto dto){
//        ProductCategory navCategory = ModelMapper.INSTANCE.toModel(dto);
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        navCategory.setAreaUserId(loginUser.getAreaUserId());
//        navCategory.setAreaUserId(loginUser.getId());
//        parameterAction.save(navCategory);
//        return ReturnResult.success(ModelMapper.INSTANCE.toVO(navCategory));
        return null;
    }

    @ApiOperation("删除id的分类属性参数")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        parameterAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的分类属性参数详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ProductCategoryUpdateDto dto){
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        ProductCategory category = ModelMapper.INSTANCE.toModel(dto);
//        category.setId(id);
//        parameterAction.updateSelf(category,loginUser.getId());
//        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
        return null;
    }

    @ApiOperation("获取id的分类属性参数详情")
    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        ProductCategory category = parameterAction.getSelf(id, loginUser.getId());
//        return ReturnResult.success(ModelMapper.INSTANCE.toVO(category));
        return null;
    }

    @ApiOperation("分页获取分类属性参数列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
//        User loginUser = SecuritySessionUtils.getLoginUser();
//        List<ProductCategory> categories = parameterAction.listSelf(parentId, loginUser.getId(),page,pageSize);
//        return ReturnResult.success(ModelMapper.INSTANCE.toCategoryVOs(categories));
        return null;
    }
}
