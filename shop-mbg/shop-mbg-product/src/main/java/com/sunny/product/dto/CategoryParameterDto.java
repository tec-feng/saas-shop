package com.sunny.product.dto;

import com.sunny.base.ValidatorTips;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author tec_feng
 * @create 2020-06-19
 */
@Data
public class CategoryParameterDto implements Serializable {

    @ApiModelProperty(value = "类目参数名称")
    @Size(min = 2,max = 20,message = ValidatorTips.CATEGORY_PARAMETER_SIZE)
    @NotEmpty(message = ValidatorTips.CATEGORY_PARAMETER_NOT_EMPTY)
    private String name;
    @ApiModelProperty(value = "排序")
    private Integer sort;
    @ApiModelProperty(value = "产品分类ID")
    @NotNull
    private Long categoryId;
    @ApiModelProperty(value = "图标")
    private String icon;
    @ApiModelProperty(value = "是否必须")
    @NotNull
    private Boolean must;
    @ApiModelProperty(value = "1->文本；2->数字，3->单选；4->多选")
    @NotNull
    private Integer selectType;
    @ApiModelProperty(value = "可选值，参数类型1(文本)、2(数字)是为提示语；3(单选)或4(多选)时为可选参数,多个用;隔开")
    @NotNull
    private String value;
    @ApiModelProperty(value = "搜索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    @NotNull
    private Integer searchType;
    @ApiModelProperty(value = "参数单位")
    private String unit;
}