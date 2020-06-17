package com.sunny.product.model;

import java.io.Serializable;
import java.util.Date;

public class Sku implements Serializable {
    private Long id;

    /**
     * 对应的商品id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     * 限购,0为不限制
     *
     * @mbg.generated
     */
    private Integer tradeMaxNums;

    /**
     * 划线价
     *
     * @mbg.generated
     */
    private Long marketPrice;

    /**
     * 价格
     *
     * @mbg.generated
     */
    private Long price;

    /**
     * 库存
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     * 预警库存
     *
     * @mbg.generated
     */
    private Integer lowStock;

    /**
     * 条形码
     *
     * @mbg.generated
     */
    private String barCode;

    /**
     * 备用条码，用作一物多码使用
     *
     * @mbg.generated
     */
    private String standbyBarCode;

    /**
     * 展示图片
     *
     * @mbg.generated
     */
    private String pic;

    /**
     * 为1时作为默认sku
     *
     * @mbg.generated
     */
    private Byte defaultSku;

    /**
     * 销量
     *
     * @mbg.generated
     */
    private Integer sale;

    /**
     * 虚拟销量
     *
     * @mbg.generated
     */
    private Integer virtualSale;

    /**
     * 0:正常上架,1:删除 ,2:失效
     *
     * @mbg.generated
     */
    private int status;

    /**
     * 记录新增的时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 记录最近修改的时间，如果为新增后未改动则保持与createTime一致
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 销售属性，比如（[{"k":"颜色","v":"黑色"},{"k":"容量","v":"128G"},,{"k":"型号","v":"iphone11"}]）
     *
     * @mbg.generated
     */
    private String skuData;

    /**
     * 销售属性,p-v，比如11-12;15-28;299-199
     *
     * @mbg.generated
     */
    private String skuDataId;

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

    public Integer getVirtualSale() {
        return virtualSale;
    }

    public void setVirtualSale(Integer virtualSale) {
        this.virtualSale = virtualSale;
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
        sb.append(", virtualSale=").append(virtualSale);
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