package com.sunny.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author tec_feng
 * @create 2020-06-02 12:37
 */
@Data
public class ProductNavCategoryDto extends ProductNavCategoryUpdateDto{
    @ApiModelProperty(value = "父类ID")
    @NotNull
    private Long parentId;
}
