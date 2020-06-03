package com.sunny.product.dto;

import com.sunny.base.ValidatorTips;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;

/**
 * @author tec_feng
 * @create 2020-06-02 12:37
 */
@Data
public class ProductCategoryDto {
    @ApiModelProperty(value = "父类ID")
    private Long parentId;
    @ApiModelProperty(value = "分类名称")
    @Size(min = 2,max = 20,message = ValidatorTips.CATEGORY_NAME_SIZE)
    private String name;
    @Size(min = 2,max = 255,message = ValidatorTips.CATEGORY_DESC_NAME_SIZE)
    @ApiModelProperty(value = "分类描述")
    private String description;
    @ApiModelProperty(value = "分类图标")
    private String icon;
    @ApiModelProperty(value = "排序ID")
    private Integer sort;
}
