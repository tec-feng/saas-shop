package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class CategoryParameter implements Serializable {
    private Long id;

    /**
     * 类目参数名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 状态，0正常，1删除
     *
     * @mbg.generated
     */
    private int status;

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
     * 图标
     *
     * @mbg.generated
     */
    private String icon;

    /**
     * 是否必须
     *
     * @mbg.generated
     */
    private Boolean must;

    /**
     * 参数选择类型：1->文本；2->数字，3->单选；4->多选
     *
     * @mbg.generated
     */
    private Boolean selectType;

    /**
     * 可选值，参数类型1(文本)、2(数字)是为提示语；3(单选)或4(多选)时为可选参数,多个用;隔开
     *
     * @mbg.generated
     */
    private String value;

    /**
     * 搜索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     *
     * @mbg.generated
     */
    private Boolean searchType;

    /**
     * 参数单位
     *
     * @mbg.generated
     */
    private String unit;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getMust() {
        return must;
    }

    public void setMust(Boolean must) {
        this.must = must;
    }

    public Boolean getSelectType() {
        return selectType;
    }

    public void setSelectType(Boolean selectType) {
        this.selectType = selectType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getSearchType() {
        return searchType;
    }

    public void setSearchType(Boolean searchType) {
        this.searchType = searchType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        sb.append(", icon=").append(icon);
        sb.append(", must=").append(must);
        sb.append(", selectType=").append(selectType);
        sb.append(", value=").append(value);
        sb.append(", searchType=").append(searchType);
        sb.append(", unit=").append(unit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}