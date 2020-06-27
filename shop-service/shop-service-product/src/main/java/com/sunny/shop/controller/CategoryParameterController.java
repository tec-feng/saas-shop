package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.CategoryParameterDto;
import com.sunny.product.model.CategoryParameter;
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.CategoryParameterAction;
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
@Api(tags = "CategoryParameterController", value = "分类属性参数")
@RestController
@RequestMapping(value = "categoryParameter")
public class CategoryParameterController {
    @Autowired
    CategoryParameterAction parameterAction;
    @Autowired
    UserFeignApi userFeignApi;
    @ApiOperation("创建分类属性参数")
    @PostMapping("/create")
    public ReturnResult create(@Valid CategoryParameterDto dto){
        CategoryParameter parameter = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        parameter.setAreaUserId(loginUser.getAreaUserId());
        parameterAction.save(parameter);
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(parameter));
    }

    @ApiOperation("删除id的分类属性参数")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        parameterAction.deleteSelf(id,loginUser.getAreaUserId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的分类属性参数详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody CategoryParameterDto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        CategoryParameter parameter = ModelMapper.INSTANCE.toModel(dto);
        parameter.setId(id);
        parameterAction.updateSelf(parameter,loginUser.getAreaUserId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(parameter));
    }

    @ApiOperation("获取id的分类属性参数详情")
    @GetMapping("/{id}")
    public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        CategoryParameter parameter = parameterAction.getSelf(id, loginUser.getAreaUserId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(parameter));
    }

    @ApiOperation("分页获取分类属性参数列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long categoryId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<CategoryParameter> categories = parameterAction.listSelf(categoryId, loginUser.getAreaUserId(),page,pageSize);
        return ReturnResult.success(ModelMapper.INSTANCE.toParameterVOs(categories));
    }
}
