package com.sunny.product.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @author tec_feng
 * @create 2020-08-31 18:57
 */
public class ProductCategoryPropertyValueDto {
    @ApiModelProperty(value = "分类属性ID")
    @NotNull
    private Long categoryPropertyId;
    @ApiModelProperty(value = "分类属性值")
    private String value;

    public Long getCategoryPropertyId() {
        return categoryPropertyId;
    }

    public void setCategoryPropertyId(Long categoryPropertyId) {
        this.categoryPropertyId = categoryPropertyId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
