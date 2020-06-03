package com.sunny.product.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author tec_feng
 * @create 2020-06-02 12:37
 */
@Data
public class ProductNavCategoryVO {
    @ApiModelProperty(value = "分类ID")
    private Long id;
    @ApiModelProperty(value = "分类名称")
    private String name;
    @ApiModelProperty(value = "分类描述")
    private String description;
    @ApiModelProperty(value = "分类图标")
    private String icon;
    @ApiModelProperty(value = "排序ID")
    private Integer sort;
}
