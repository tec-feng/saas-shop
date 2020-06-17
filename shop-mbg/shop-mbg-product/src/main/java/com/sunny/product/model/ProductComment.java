package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class ProductComment implements Serializable {
    private Long id;

    private Long productId;

    /**
     * 所购买的sku的id
     *
     * @mbg.generated
     */
    private Long skuId;

    /**
     * SKU的property_value
     *
     * @mbg.generated
     */
    private String propertyValue;

    /**
     * 发表者id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     * 发表者昵称
     *
     * @mbg.generated
     */
    private String userNick;

    private String userHead;

    /**
     * 评价标识，来源，类型，内外等
     *
     * @mbg.generated
     */
    private String mark;

    /**
     * 商品打分
     *
     * @mbg.generated
     */
    private Byte point;

    /**
     * 是否匿名,0否(不匿名),1是(匿名)
     *
     * @mbg.generated
     */
    private Byte anonymous;

    /**
     * 是否隐藏，0不隐藏，1隐藏
     *
     * @mbg.generated
     */
    private Byte hide;

    /**
     * 商品晒图，JSON格式
     *
     * @mbg.generated
     */
    private String images;

    /**
     * 评论数量
     *
     * @mbg.generated
     */
    private Integer replyNumber;

    /**
     * 点赞数量
     *
     * @mbg.generated
     */
    private Integer agreeNumber;

    /**
     * 购买日期
     *
     * @mbg.generated
     */
    private Date buyTime;

    /**
     * 是否是真实评论 0:真 1:假
     *
     * @mbg.generated
     */
    private Byte isFake;

    /**
     * 0正常，1删除
     *
     * @mbg.generated
     */
    private int status;

    private Date createTime;

    private Date updateTime;

    /**
     * 区域ID
     *
     * @mbg.generated
     */
    private Long areaUserId;

    private String content;

    private String blocks;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Byte getPoint() {
        return point;
    }

    public void setPoint(Byte point) {
        this.point = point;
    }

    public Byte getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Byte anonymous) {
        this.anonymous = anonymous;
    }

    public Byte getHide() {
        return hide;
    }

    public void setHide(Byte hide) {
        this.hide = hide;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Integer getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(Integer replyNumber) {
        this.replyNumber = replyNumber;
    }

    public Integer getAgreeNumber() {
        return agreeNumber;
    }

    public void setAgreeNumber(Integer agreeNumber) {
        this.agreeNumber = agreeNumber;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Byte getIsFake() {
        return isFake;
    }

    public void setIsFake(Byte isFake) {
        this.isFake = isFake;
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

    public Long getAreaUserId() {
        return areaUserId;
    }

    public void setAreaUserId(Long areaUserId) {
        this.areaUserId = areaUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlocks() {
        return blocks;
    }

    public void setBlocks(String blocks) {
        this.blocks = blocks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", skuId=").append(skuId);
        sb.append(", propertyValue=").append(propertyValue);
        sb.append(", userId=").append(userId);
        sb.append(", userNick=").append(userNick);
        sb.append(", userHead=").append(userHead);
        sb.append(", mark=").append(mark);
        sb.append(", point=").append(point);
        sb.append(", anonymous=").append(anonymous);
        sb.append(", hide=").append(hide);
        sb.append(", images=").append(images);
        sb.append(", replyNumber=").append(replyNumber);
        sb.append(", agreeNumber=").append(agreeNumber);
        sb.append(", buyTime=").append(buyTime);
        sb.append(", isFake=").append(isFake);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", areaUserId=").append(areaUserId);
        sb.append(", content=").append(content);
        sb.append(", blocks=").append(blocks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}