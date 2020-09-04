package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class CategoryProperty implements Serializable {
    private Long id;

    /**
     * 类目属性名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 状态，0正常，1删除
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 排序
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     * 产品分类ID
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * 区域ID
     *
     * @mbg.generated
     */
    private Long areaUserId;

    /**
     * 搜索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     *
     * @mbg.generated
     */
    private Integer searchType;

    /**
     * 规格值录入方式：0->手工录入；1->从列表中选取
     *
     * @mbg.generated
     */
    private Integer valueType;

    /**
     * 可选值，value_type为0时，数据为空，如果value_type为1时为可选参数,多个用;隔开
     *
     * @mbg.generated
     */
    private String value;

    /**
     * 是否支持手动添加，0->不支持，1->支持；如果value_type为0时，默认手动添加。如果value_type为1时，除了选择已有选项，是否还可以手动添加
     *
     * @mbg.generated
     */
    private Integer manuallyAdd;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getAreaUserId() {
        return areaUserId;
    }

    public void setAreaUserId(Long areaUserId) {
        this.areaUserId = areaUserId;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getManuallyAdd() {
        return manuallyAdd;
    }

    public void setManuallyAdd(Integer manuallyAdd) {
        this.manuallyAdd = manuallyAdd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sort=").append(sort);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", areaUserId=").append(areaUserId);
        sb.append(", searchType=").append(searchType);
        sb.append(", valueType=").append(valueType);
        sb.append(", value=").append(value);
        sb.append(", manuallyAdd=").append(manuallyAdd);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}