package com.sunny.shop.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.product.mapper.SkuMapper;
import com.sunny.product.model.Sku;
import com.sunny.product.model.SkuExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-05-20 12:20:30
*/
@Service
public class SkuService extends BaseService<Sku,SkuExample>{
    @Autowired
    SkuMapper skuMapper;
    @Override
    protected BaseMapper<Sku, SkuExample> getMapper() {
        return skuMapper;
    }
}