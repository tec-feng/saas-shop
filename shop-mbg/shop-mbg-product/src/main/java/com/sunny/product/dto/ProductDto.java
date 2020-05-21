package com.sunny.product.dto;

import com.sunny.base.ValidatorTips;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;


/**
 * @author tec_feng
 * @create 2020-05-12 13:04
 */
@Data
public class ProductDto {
    @ApiModelProperty(value = "商品名称")
    @Size(min = 2,max = 70,message = ValidatorTips.PRODUCT_NAME_SIZE)
    private String name;
    @ApiModelProperty(value = "商品描述")
    @NotEmpty
    private String description;
    @ApiModelProperty(value = "0付款减库存，1拍下减库存")
    @NotNull
    private Integer storeStrategy;
    @ApiModelProperty(value = "仓库ID")
    @NotNull
    private Integer storageId;
    @ApiModelProperty(value = "来自于分销中心商品")
    private String fromId;
    @ApiModelProperty(value = "运费模板ID")
    private Long freightTemplateId;
    @ApiModelProperty(value = "主图")
    @NotEmpty
    private String pic;
    @ApiModelProperty(value = "统一运费")
    private Long shippingFee;
    @ApiModelProperty(value = "商品详情")
    @NotEmpty
    private String detail;
    @ApiModelProperty(value = "主图列表")
    private List<String> mainPic;

}
