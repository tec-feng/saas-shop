package com.sunny.shop.action;

import cn.hutool.core.date.DateUtil;
import com.sunny.base.ApiCode;
import com.sunny.base.ApiException;
import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.ProductNavCategory;
import com.sunny.product.model.ProductNavCategoryExample;
import com.sunny.shop.common.ModelMapper;
import com.sunny.shop.service.ProductNavCategoryService;
import com.sunny.tools.SnowFlakeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-05-25 01:05:16
*/
@Component
public class ProductNavCategoryAction extends BaseAction<ProductNavCategory,ProductNavCategoryExample>{
    @Autowired
    ProductNavCategoryService productNavCategoryService;
    @Override
    protected BaseService<ProductNavCategory, ProductNavCategoryExample> getService() {
        return productNavCategoryService;
    }

    @Override
    public int save(ProductNavCategory record) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andNameEqualTo(record.getName()).andAreaUserIdEqualTo(record.getAreaUserId());
        long count = countByExample(example);
        if(count>0){
            throw new ApiException(ApiCode.NAV_CATEGORY_EXIST);
        }
        record.setId(SnowFlakeUtils.nextId());
        record.setCreateTime(DateUtil.date());
        if(record.getParentId() ==0){
            record.setLevel(1);
        }else{
            ProductNavCategory parentCategory = productNavCategoryService.selectByKey(record.getParentId());
            record.setLevel(parentCategory.getLevel()+1);
        }
        return super.save(record);
    }

    public int deleteSelf(long id,long userId) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.deleteByExample(example);
    }

    public int updateSelf(ProductNavCategory navCategory,long userId) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andIdEqualTo(navCategory.getId()).andAreaUserIdEqualTo(userId);
        return super.updateByExampleSelective(navCategory,example);
    }

    public ProductNavCategory getSelf(long id,long userId) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<ProductNavCategory> listSelf(long parentId, long userId,Integer page,Integer pageSize) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId).andAreaUserIdEqualTo(userId);
        return super.selectByExample(example,page,pageSize);
    }
}
