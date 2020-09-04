package com.sunny.product.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * @author tec_feng
 * @create 2020-08-31 18:57
 */
public class ProductCategoryParameterValueDto {
    @ApiModelProperty(value = "分类参数ID")
    @NotNull
    private Long categoryParameterId;
    @ApiModelProperty(value = "分类参数值")
    private String value;

    public Long getCategoryParameterId() {
        return categoryParameterId;
    }

    public void setCategoryParameterId(Long categoryParameterId) {
        this.categoryParameterId = categoryParameterId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
