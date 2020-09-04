package com.sunny.shop.action;

import com.sunny.base.ApiCode;
import com.sunny.base.ApiException;
import cn.hutool.core.date.DateUtil;
import com.sunny.tools.SnowFlakeUtils;
import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductCategoryParameterValue;
import com.sunny.product.model.ProductCategoryParameterValueExample;
import com.sunny.shop.service.ProductCategoryParameterValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-08-31 06:55:03
*/
@Component
public class ProductCategoryParameterValueAction extends BaseAction<ProductCategoryParameterValue,ProductCategoryParameterValueExample>{
    @Autowired
    ProductCategoryParameterValueService productCategoryParameterValueService;
    @Override
    protected BaseService<ProductCategoryParameterValue, ProductCategoryParameterValueExample> getService() {
        return productCategoryParameterValueService;
    }

    @Override
    public int save(ProductCategoryParameterValue record) {
        ProductCategoryParameterValueExample example = new ProductCategoryParameterValueExample();
        example.createCriteria().andUserIdEqualTo(record.getUserId());
        long count = countByExample(example);
        if(count>0){
            throw new ApiException(ApiCode.USER_PRODUCT_CATEGORY_EXIST);
        }
        record.setId(SnowFlakeUtils.nextId());
        record.setCreateTime(DateUtil.date());
        return super.save(record);
    }
    public int deleteSelf(long id,long userId) {
        ProductCategoryParameterValueExample example = new ProductCategoryParameterValueExample();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.deleteByExample(example);
    }

    public int updateSelf(ProductCategoryParameterValue record,long userId) {
        ProductCategoryParameterValueExample example = new ProductCategoryParameterValueExample();
        example.createCriteria().andIdEqualTo(record.getId()).andUserIdEqualTo(userId);
        return super.updateByExampleSelective(record,example);
    }

    public ProductCategoryParameterValue getSelf(long id,long userId) {
        ProductCategoryParameterValueExample example = new ProductCategoryParameterValueExample();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<ProductCategoryParameterValue> listSelf(long categoryId, long userId, Integer page, Integer pageSize) {
        ProductCategoryParameterValueExample example = new ProductCategoryParameterValueExample();
        example.createCriteria().andCategoryParameterIdEqualTo(categoryId).andUserIdEqualTo(userId);
        return super.selectByExample(example,page,pageSize);
    }
}
