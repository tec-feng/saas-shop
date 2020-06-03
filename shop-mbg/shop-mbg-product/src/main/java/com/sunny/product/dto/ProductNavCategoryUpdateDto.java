package com.sunny.product.dto;

import com.sunny.base.ValidatorTips;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author tec_feng
 * @create 2020-06-03 12:40
 */
public class ProductNavCategoryUpdateDto {
    @ApiModelProperty(value = "分类名称")
    @Size(min = 2,max = 20,message = ValidatorTips.CATEGORY_NAME_SIZE)
    @NotEmpty
    private String name;
    @Size(min = 2,max = 255,message = ValidatorTips.CATEGORY_DESC_NAME_SIZE)
    @ApiModelProperty(value = "分类描述")
    private String description;
    @ApiModelProperty(value = "分类图标")
    private String icon;
    @ApiModelProperty(value = "排序ID")
    private Integer sort;
}
