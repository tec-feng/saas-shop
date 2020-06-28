package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Long id;

    /**
     * 商品名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 商品描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 0付款减库存，1拍下减库存
     *
     * @mbg.generated
     */
    private Integer storeStrategy;

    /**
     * 0下架1上架
     *
     * @mbg.generated
     */
    private Byte onlineStatus;

    /**
     * 0正常1删除
     *
     * @mbg.generated
     */
    private Integer status;

    private Date createTime;

    private Date updateTime;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 仓库ID
     *
     * @mbg.generated
     */
    private Long storageId;

    /**
     * 分销池，0为正常商品，1为分销商品
     *
     * @mbg.generated
     */
    private Byte inPool;

    /**
     * 店铺编号
     *
     * @mbg.generated
     */
    private String shopNo;

    /**
     * 区域ID
     *
     * @mbg.generated
     */
    private Long areaUserId;

    /**
     * 来自于分销中心商品
     *
     * @mbg.generated
     */
    private Long fromId;

    /**
     * 运费模板ID
     *
     * @mbg.generated
     */
    private Long freightTemplateId;

    /**
     * 主图
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * 新品状态:0->不是新品；1->新品
     *
     * @mbg.generated
     */
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     *
     * @mbg.generated
     */
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     *
     * @mbg.generated
     */
    private Integer verifyStatus;

    /**
     * 搜索关键字
     *
     * @mbg.generated
     */
    private String keywords;

    /**
     * 统一运费
     *
     * @mbg.generated
     */
    private Long shippingFee;

    /**
     * 分类ID
     *
     * @mbg.generated
     */
    private Long categoryId;

    /**
     * 商品详情
     *
     * @mbg.generated
     */
    private String detail;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStoreStrategy() {
        return storeStrategy;
    }

    public void setStoreStrategy(Integer storeStrategy) {
        this.storeStrategy = storeStrategy;
    }

    public Byte getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(Byte onlineStatus) {
        this.onlineStatus = onlineStatus;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getStorageId() {
        return storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public Byte getInPool() {
        return inPool;
    }

    public void setInPool(Byte inPool) {
        this.inPool = inPool;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public Long getAreaUserId() {
        return areaUserId;
    }

    public void setAreaUserId(Long areaUserId) {
        this.areaUserId = areaUserId;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Long getFreightTemplateId() {
        return freightTemplateId;
    }

    public void setFreightTemplateId(Long freightTemplateId) {
        this.freightTemplateId = freightTemplateId;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Long getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Long shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", storeStrategy=").append(storeStrategy);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userId=").append(userId);
        sb.append(", storageId=").append(storageId);
        sb.append(", inPool=").append(inPool);
        sb.append(", shopNo=").append(shopNo);
        sb.append(", areaUserId=").append(areaUserId);
        sb.append(", fromId=").append(fromId);
        sb.append(", freightTemplateId=").append(freightTemplateId);
        sb.append(", pic=").append(pic);
        sb.append(", newStatus=").append(newStatus);
        sb.append(", recommandStatus=").append(recommandStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", keywords=").append(keywords);
        sb.append(", shippingFee=").append(shippingFee);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}