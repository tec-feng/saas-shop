package com.sunny.product.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author tec_feng
 * @create 2020-06-22 22:52
 */
@Data
public class CategoryPropertyVO {
    @ApiModelProperty(value = "分类参数ID")
    private Long id;
    @ApiModelProperty(value = "类目属性名称")
    private String name;
    @ApiModelProperty(value = "排序")
    private Integer sort;
    @ApiModelProperty(value = "产品分类ID")
    private Long categoryId;
    @ApiModelProperty(value = "搜索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    private int searchType;
    @ApiModelProperty(value = "规格值录入方式：0->手工录入；1->从列表中选取")
    private int valueType;
    @ApiModelProperty(value = "可选值，value_type为0时，数据为空，如果value_type为1时为可选参数,多个用;隔开")
    private String value;
    @ApiModelProperty(value = "是否支持手动添加，0->不支持，1->支持；如果value_type为0时，默认手动添加。如果value_type为1时，除了选择已有选项，是否还可以手动添加")
    private int manuallyAdd;
}
