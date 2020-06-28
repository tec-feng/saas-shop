package com.sunny.shop.action;

import cn.hutool.core.date.DateUtil;
import com.sunny.base.*;
import com.sunny.product.model.ProductUserCategory;
import com.sunny.product.model.ProductUserCategoryExample;
import com.sunny.shop.service.ProductUserCategoryService;
import com.sunny.tools.SnowFlakeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-06-19 01:10:56
*/
@Component
public class ProductUserCategoryAction extends BaseAction<ProductUserCategory,ProductUserCategoryExample>{
    @Autowired
    ProductUserCategoryService productUserCategoryService;
    @Override
    protected BaseService<ProductUserCategory, ProductUserCategoryExample> getService() {
        return productUserCategoryService;
    }
    @Override
    public int save(ProductUserCategory record) {
        ProductUserCategoryExample example = new ProductUserCategoryExample();
        example.createCriteria().andNameEqualTo(record.getName()).andUserIdEqualTo(record.getUserId());
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
            ProductUserCategory parentCategory = productUserCategoryService.selectByKey(record.getParentId());
            record.setLevel(parentCategory.getLevel()+1);
        }
        return super.save(record);
    }

    public int deleteSelf(long id,long userId) {
        ProductUserCategoryExample example = new ProductUserCategoryExample();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        ProductUserCategory userCategory = new ProductUserCategory();
        userCategory.setId(id);
        userCategory.setStatus(BaseStatus.DELETE_STATUS);
        return super.updateByExampleSelective(userCategory,example);
    }

    public int updateSelf(ProductUserCategory navCategory,long userId) {
        ProductUserCategoryExample example = new ProductUserCategoryExample();
        example.createCriteria().andIdEqualTo(navCategory.getId()).andUserIdEqualTo(userId);
        return super.updateByExampleSelective(navCategory,example);
    }

    public ProductUserCategory getSelf(long id,long userId) {
        ProductUserCategoryExample example = new ProductUserCategoryExample();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<ProductUserCategory> listSelf(long parentId, long userId, Integer page, Integer pageSize) {
        ProductUserCategoryExample example = new ProductUserCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId).andUserIdEqualTo(userId)
        .andStatusEqualTo(BaseStatus.NORMAL_STATUS);
        return super.selectByExample(example,page,pageSize);
    }
}
