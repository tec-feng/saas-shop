package com.sunny.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * @author tec_feng
 * @create 2020-05-12 13:04
 */
@Data
public class ProductDto {
    @ApiModelProperty(value = "商品名称")
    private String name;
    @ApiModelProperty(value = "商品描述")
    private String description;
    @ApiModelProperty(value = "0付款减库存，1拍下减库存")
    private Integer storeStrategy;
    @ApiModelProperty(value = "仓库ID")
    private Integer storageId;
    @ApiModelProperty(value = "来自于分销中心商品")
    private String fromId;
    @ApiModelProperty(value = "运费模板ID")
    private Long freightTemplateId;
    @ApiModelProperty(value = "运费模板ID")
    private String pic;
    @ApiModelProperty(value = "统一运费")
    private Long shippingFee;
    @ApiModelProperty(value = "商品详情")
    private String detail;
}
