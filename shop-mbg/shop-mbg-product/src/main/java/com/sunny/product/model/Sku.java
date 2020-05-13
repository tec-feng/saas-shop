package com.sunny.product.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Sku implements Serializable {
    private String id;

    /**
     * 对应的商品id
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "对应的商品id")
    private Integer productId;

    /**
     * 限购,0为不限制
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "限购,0为不限制")
    private Integer tradeMaxNums;

    /**
     * 划线价
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "划线价")
    private Long marketPrice;

    /**
     * 价格
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "价格")
    private Long price;

    /**
     * 库存
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "库存")
    private Integer stock;

    /**
     * 预警库存
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "预警库存")
    private Integer lowStock;

    /**
     * 条形码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "条形码")
    private String barCode;

    /**
     * 备用条码，用作一物多码使用
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备用条码，用作一物多码使用")
    private String standbyBarCode;

    /**
     * 展示图片
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "展示图片")
    private String pic;

    /**
     * 为1时作为默认sku
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "为1时作为默认sku")
    private Byte defaultSku;

    /**
     * 销量
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "销量")
    private Integer sale;

    /**
     * 0:正常上架,1:删除 ,2:失效
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "0:正常上架,1:删除 ,2:失效")
    private Byte status;

    /**
     * 记录新增的时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "记录新增的时间")
    private Date createTime;

    /**
     * 记录最近修改的时间，如果为新增后未改动则保持与createTime一致
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "记录最近修改的时间，如果为新增后未改动则保持与createTime一致")
    private Date updateTime;

    /**
     * 销售属性
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "销售属性")
    private String skuData;

    /**
     * 销售属性,p-v
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "销售属性,p-v")
    private String skuDataId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getTradeMaxNums() {
        return tradeMaxNums;
    }

    public void setTradeMaxNums(Integer tradeMaxNums) {
        this.tradeMaxNums = tradeMaxNums;
    }

    public Long getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Long marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getStandbyBarCode() {
        return standbyBarCode;
    }

    public void setStandbyBarCode(String standbyBarCode) {
        this.standbyBarCode = standbyBarCode;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Byte getDefaultSku() {
        return defaultSku;
    }

    public void setDefaultSku(Byte defaultSku) {
        this.defaultSku = defaultSku;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
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

    public String getSkuData() {
        return skuData;
    }

    public void setSkuData(String skuData) {
        this.skuData = skuData;
    }

    public String getSkuDataId() {
        return skuDataId;
    }

    public void setSkuDataId(String skuDataId) {
        this.skuDataId = skuDataId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", tradeMaxNums=").append(tradeMaxNums);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", barCode=").append(barCode);
        sb.append(", standbyBarCode=").append(standbyBarCode);
        sb.append(", pic=").append(pic);
        sb.append(", defaultSku=").append(defaultSku);
        sb.append(", sale=").append(sale);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", skuData=").append(skuData);
        sb.append(", skuDataId=").append(skuDataId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}