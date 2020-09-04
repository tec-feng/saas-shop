package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.CategoryPropertyDto;
import com.sunny.product.model.CategoryProperty;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.CategoryPropertyAction;
import com.sunny.shop.common.ModelMapper;
import com.sunny.user.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
* 区域管理员设置分类属性
* @author tec_feng
* @create 2020-06-02 12:36
*/
@Api(tags = "CategoryPropertyController", description = "商品后台类目")
@RestController
@RequestMapping(value = "categoryProperty")
public class CategoryPropertyController {
    @Autowired
    CategoryPropertyAction categoryPropertyAction;

    @ApiOperation("创建分类属性")
    @PostMapping("/create")
    public ReturnResult create(@Valid CategoryPropertyDto dto){
        CategoryProperty categoryProperty = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        categoryProperty.setAreaUserId(loginUser.getAreaUserId());
        categoryPropertyAction.save(categoryProperty);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(categoryProperty));
    }

    @ApiOperation("删除id的后台类目")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        categoryPropertyAction.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的后台类目详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody CategoryPropertyDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        CategoryProperty categoryProperty = ModelMapper.INSTANCE.toModel(dto);
        categoryProperty.setId(id);
        categoryPropertyAction.updateSelf(categoryProperty,loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(categoryProperty));
    }

    @ApiOperation("获取id的后台类目详情")
    @GetMapping("/{id}")
        public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        CategoryProperty categoryProperty = categoryPropertyAction.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(categoryProperty));
    }

    @ApiOperation("分页获取后台类目列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long categoryId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<CategoryProperty> categoryPropertys = categoryPropertyAction.listSelf(categoryId, loginUser.getId(),page,pageSize);
            return ReturnResult.success(ModelMapper.INSTANCE.toCategoryPropertyVOs(categoryPropertys));
        }
    }
