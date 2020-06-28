package com.sunny.product.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsIsNull() {
            addCriterion("trade_max_nums is null");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsIsNotNull() {
            addCriterion("trade_max_nums is not null");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsEqualTo(Integer value) {
            addCriterion("trade_max_nums =", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsNotEqualTo(Integer value) {
            addCriterion("trade_max_nums <>", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsGreaterThan(Integer value) {
            addCriterion("trade_max_nums >", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_max_nums >=", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsLessThan(Integer value) {
            addCriterion("trade_max_nums <", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsLessThanOrEqualTo(Integer value) {
            addCriterion("trade_max_nums <=", value, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsIn(List<Integer> values) {
            addCriterion("trade_max_nums in", values, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsNotIn(List<Integer> values) {
            addCriterion("trade_max_nums not in", values, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsBetween(Integer value1, Integer value2) {
            addCriterion("trade_max_nums between", value1, value2, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andTradeMaxNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_max_nums not between", value1, value2, "tradeMaxNums");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Long value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Long value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Long value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Long value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Long value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Long> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Long> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Long value1, Long value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Long value1, Long value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNull() {
            addCriterion("low_stock is null");
            return (Criteria) this;
        }

        public Criteria andLowStockIsNotNull() {
            addCriterion("low_stock is not null");
            return (Criteria) this;
        }

        public Criteria andLowStockEqualTo(Integer value) {
            addCriterion("low_stock =", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotEqualTo(Integer value) {
            addCriterion("low_stock <>", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThan(Integer value) {
            addCriterion("low_stock >", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("low_stock >=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThan(Integer value) {
            addCriterion("low_stock <", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockLessThanOrEqualTo(Integer value) {
            addCriterion("low_stock <=", value, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockIn(List<Integer> values) {
            addCriterion("low_stock in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotIn(List<Integer> values) {
            addCriterion("low_stock not in", values, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockBetween(Integer value1, Integer value2) {
            addCriterion("low_stock between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andLowStockNotBetween(Integer value1, Integer value2) {
            addCriterion("low_stock not between", value1, value2, "lowStock");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeIsNull() {
            addCriterion("standby_bar_code is null");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeIsNotNull() {
            addCriterion("standby_bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeEqualTo(String value) {
            addCriterion("standby_bar_code =", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeNotEqualTo(String value) {
            addCriterion("standby_bar_code <>", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeGreaterThan(String value) {
            addCriterion("standby_bar_code >", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("standby_bar_code >=", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeLessThan(String value) {
            addCriterion("standby_bar_code <", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeLessThanOrEqualTo(String value) {
            addCriterion("standby_bar_code <=", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeLike(String value) {
            addCriterion("standby_bar_code like", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeNotLike(String value) {
            addCriterion("standby_bar_code not like", value, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeIn(List<String> values) {
            addCriterion("standby_bar_code in", values, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeNotIn(List<String> values) {
            addCriterion("standby_bar_code not in", values, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeBetween(String value1, String value2) {
            addCriterion("standby_bar_code between", value1, value2, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andStandbyBarCodeNotBetween(String value1, String value2) {
            addCriterion("standby_bar_code not between", value1, value2, "standbyBarCode");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIsNull() {
            addCriterion("default_sku is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIsNotNull() {
            addCriterion("default_sku is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuEqualTo(Byte value) {
            addCriterion("default_sku =", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuNotEqualTo(Byte value) {
            addCriterion("default_sku <>", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuGreaterThan(Byte value) {
            addCriterion("default_sku >", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuGreaterThanOrEqualTo(Byte value) {
            addCriterion("default_sku >=", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuLessThan(Byte value) {
            addCriterion("default_sku <", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuLessThanOrEqualTo(Byte value) {
            addCriterion("default_sku <=", value, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIn(List<Byte> values) {
            addCriterion("default_sku in", values, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuNotIn(List<Byte> values) {
            addCriterion("default_sku not in", values, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuBetween(Byte value1, Byte value2) {
            addCriterion("default_sku between", value1, value2, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuNotBetween(Byte value1, Byte value2) {
            addCriterion("default_sku not between", value1, value2, "defaultSku");
            return (Criteria) this;
        }

        public Criteria andSaleIsNull() {
            addCriterion("sale is null");
            return (Criteria) this;
        }

        public Criteria andSaleIsNotNull() {
            addCriterion("sale is not null");
            return (Criteria) this;
        }

        public Criteria andSaleEqualTo(Integer value) {
            addCriterion("sale =", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotEqualTo(Integer value) {
            addCriterion("sale <>", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThan(Integer value) {
            addCriterion("sale >", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale >=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThan(Integer value) {
            addCriterion("sale <", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleLessThanOrEqualTo(Integer value) {
            addCriterion("sale <=", value, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleIn(List<Integer> values) {
            addCriterion("sale in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotIn(List<Integer> values) {
            addCriterion("sale not in", values, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleBetween(Integer value1, Integer value2) {
            addCriterion("sale between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("sale not between", value1, value2, "sale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleIsNull() {
            addCriterion("virtual_sale is null");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleIsNotNull() {
            addCriterion("virtual_sale is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleEqualTo(Integer value) {
            addCriterion("virtual_sale =", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleNotEqualTo(Integer value) {
            addCriterion("virtual_sale <>", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleGreaterThan(Integer value) {
            addCriterion("virtual_sale >", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("virtual_sale >=", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleLessThan(Integer value) {
            addCriterion("virtual_sale <", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleLessThanOrEqualTo(Integer value) {
            addCriterion("virtual_sale <=", value, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleIn(List<Integer> values) {
            addCriterion("virtual_sale in", values, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleNotIn(List<Integer> values) {
            addCriterion("virtual_sale not in", values, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleBetween(Integer value1, Integer value2) {
            addCriterion("virtual_sale between", value1, value2, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andVirtualSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("virtual_sale not between", value1, value2, "virtualSale");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSkuDataIsNull() {
            addCriterion("sku_data is null");
            return (Criteria) this;
        }

        public Criteria andSkuDataIsNotNull() {
            addCriterion("sku_data is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDataEqualTo(String value) {
            addCriterion("sku_data =", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataNotEqualTo(String value) {
            addCriterion("sku_data <>", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataGreaterThan(String value) {
            addCriterion("sku_data >", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataGreaterThanOrEqualTo(String value) {
            addCriterion("sku_data >=", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataLessThan(String value) {
            addCriterion("sku_data <", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataLessThanOrEqualTo(String value) {
            addCriterion("sku_data <=", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataLike(String value) {
            addCriterion("sku_data like", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataNotLike(String value) {
            addCriterion("sku_data not like", value, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataIn(List<String> values) {
            addCriterion("sku_data in", values, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataNotIn(List<String> values) {
            addCriterion("sku_data not in", values, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataBetween(String value1, String value2) {
            addCriterion("sku_data between", value1, value2, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataNotBetween(String value1, String value2) {
            addCriterion("sku_data not between", value1, value2, "skuData");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdIsNull() {
            addCriterion("sku_data_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdIsNotNull() {
            addCriterion("sku_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdEqualTo(String value) {
            addCriterion("sku_data_id =", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdNotEqualTo(String value) {
            addCriterion("sku_data_id <>", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdGreaterThan(String value) {
            addCriterion("sku_data_id >", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("sku_data_id >=", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdLessThan(String value) {
            addCriterion("sku_data_id <", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdLessThanOrEqualTo(String value) {
            addCriterion("sku_data_id <=", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdLike(String value) {
            addCriterion("sku_data_id like", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdNotLike(String value) {
            addCriterion("sku_data_id not like", value, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdIn(List<String> values) {
            addCriterion("sku_data_id in", values, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdNotIn(List<String> values) {
            addCriterion("sku_data_id not in", values, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdBetween(String value1, String value2) {
            addCriterion("sku_data_id between", value1, value2, "skuDataId");
            return (Criteria) this;
        }

        public Criteria andSkuDataIdNotBetween(String value1, String value2) {
            addCriterion("sku_data_id not between", value1, value2, "skuDataId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}