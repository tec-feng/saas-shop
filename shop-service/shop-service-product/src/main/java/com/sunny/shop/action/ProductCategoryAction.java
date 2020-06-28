package com.sunny.shop.action;

import cn.hutool.core.date.DateUtil;
import com.sunny.base.*;
import com.sunny.product.model.ProductCategory;
import com.sunny.product.model.ProductCategoryExample;
import com.sunny.shop.service.ProductCategoryService;
import com.sunny.tools.SnowFlakeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-05-20 12:19:27
*/
@Component
public class ProductCategoryAction extends BaseAction<ProductCategory,ProductCategoryExample>{
    @Autowired
    ProductCategoryService productCategoryService;
    @Override
    protected BaseService<ProductCategory, ProductCategoryExample> getService() {
        return productCategoryService;
    }

    @Override
    public int save(ProductCategory record) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andNameEqualTo(record.getName());
        long count = countByExample(example);
        if(count>0){
            throw new ApiException(ApiCode.NAV_CATEGORY_EXIST);
        }
        record.setId(SnowFlakeUtils.nextId());
        record.setCreateTime(DateUtil.date());
        record.setStatus(0);
        if(record.getParentId() ==0){
            record.setLevel(1);
        }else{
            ProductCategory parentCategory = productCategoryService.selectByKey(record.getParentId());
            record.setLevel(parentCategory.getLevel()+1);
        }
        return super.save(record);
    }

    public int deleteSelf(long id,long userId) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        ProductCategory category = new ProductCategory();
        category.setId(id);
        category.setStatus(BaseStatus.DELETE_STATUS);
        return super.updateByExampleSelective(category,example);
    }

    public int updateSelf(ProductCategory navCategory,long userId) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andIdEqualTo(navCategory.getId()).andAreaUserIdEqualTo(userId);
        return super.updateByExampleSelective(navCategory,example);
    }

    public ProductCategory getSelf(long id,long userId) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<ProductCategory> listSelf(long parentId, long userId, Integer page, Integer pageSize) {
        ProductCategoryExample example = new ProductCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId).andAreaUserIdEqualTo(userId)
        .andStatusEqualTo(BaseStatus.NORMAL_STATUS);
        return super.selectByExample(example,page,pageSize);
    }
}
