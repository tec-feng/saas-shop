package com.sunny.shop.controller;

import com.sunny.base.ReturnResult;
import com.sunny.product.dto.${UpperClassName}Dto;
import com.sunny.product.model.${UpperClassName};
import com.sunny.security.config.SecuritySessionUtils;
import com.sunny.shop.action.${UpperClassName}Action;
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
* ${Detail}
* @author tec_feng
* @create 2020-06-02 12:36
*/
@Api(tags = "${UpperClassName}Controller", description = "${Detail}")
@RestController
@RequestMapping(value = "${lowerClassName}")
public class ${UpperClassName}Controller {
    @Autowired
    ${UpperClassName}Action ${lowerClassName}Action;
    @Autowired
    UserFeignApi userFeignApi;

    @ApiOperation("创建${Desc}")
    @PostMapping("/create")
    public ReturnResult create(@Valid ${UpperClassName}Dto dto){
        ${UpperClassName} ${lowerClassName} = ModelMapper.INSTANCE.toModel(dto);
        User loginUser = SecuritySessionUtils.getLoginUser();
        ${lowerClassName}.setUserId(loginUser.getId());
        ${lowerClassName}Action.save(${lowerClassName});
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(${lowerClassName}));
    }

    @ApiOperation("删除id的${Desc}")
    @DeleteMapping("/delete/{id}")
    public ReturnResult delete(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ${lowerClassName}Action.deleteSelf(id,loginUser.getId());
        return ReturnResult.success();
    }

    @ApiOperation("更新id的${Desc}详情")
    @PutMapping("/update/{id}")
    public ReturnResult update(@PathVariable("id")Long id,@RequestBody ${UpperClassName}Dto dto){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ${UpperClassName} ${lowerClassName} = ModelMapper.INSTANCE.toModel(dto);
        ${lowerClassName}.setId(id);
        ${lowerClassName}Action.updateSelf(${lowerClassName},loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(${lowerClassName}));
    }

    @ApiOperation("获取id的${Desc}详情")
    @GetMapping("/{id}")
        public ReturnResult get(@PathVariable("id")Long id){
        User loginUser = SecuritySessionUtils.getLoginUser();
        ${UpperClassName} ${lowerClassName} = ${lowerClassName}Action.getSelf(id, loginUser.getId());
        return ReturnResult.success(ModelMapper.INSTANCE.toVO(${lowerClassName}));
    }

    @ApiOperation("分页获取${Desc}列表")
    @GetMapping
    public ReturnResult list(@RequestParam Long parentId,
                             @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                             @RequestParam(value = "pageSize", required = false, defaultValue = "20") int pageSize){
        User loginUser = SecuritySessionUtils.getLoginUser();
        List<${UpperClassName}> ${lowerClassName}s = ${lowerClassName}Action.listSelf(parentId, loginUser.getId(),page,pageSize);
            return ReturnResult.success(ModelMapper.INSTANCE.to${UpperClassName}VOs(${lowerClassName}s));
        }
    }
