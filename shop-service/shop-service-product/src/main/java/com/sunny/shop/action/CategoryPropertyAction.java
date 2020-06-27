package com.sunny.shop.action;

import com.sunny.base.ApiCode;
import com.sunny.base.ApiException;
import cn.hutool.core.date.DateUtil;
import com.sunny.tools.SnowFlakeUtils;
import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.product.model.CategoryProperty;
import com.sunny.product.model.CategoryPropertyExample;
import com.sunny.shop.service.CategoryPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-06-22 07:48:05
*/
@Component
public class CategoryPropertyAction extends BaseAction<CategoryProperty,CategoryPropertyExample>{
    @Autowired
    CategoryPropertyService categoryPropertyService;
    @Override
    protected BaseService<CategoryProperty, CategoryPropertyExample> getService() {
        return categoryPropertyService;
    }

    @Override
    public int save(CategoryProperty record) {
        CategoryPropertyExample example = new CategoryPropertyExample();
        example.createCriteria().andAreaUserIdEqualTo(record.getAreaUserId());
        long count = countByExample(example);
        if(count>0){
            throw new ApiException(ApiCode.CATEGORY_PROPERTY_EXIST);
        }
        record.setId(SnowFlakeUtils.nextId());
        record.setCreateTime(DateUtil.date());
        if(record.getSort() == null){
            record.setSort(0);
        }
        return super.save(record);
    }
    public int deleteSelf(long id,long userId) {
        CategoryPropertyExample example = new CategoryPropertyExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.deleteByExample(example);
    }

    public int updateSelf(CategoryProperty record,long userId) {
        CategoryPropertyExample example = new CategoryPropertyExample();
        example.createCriteria().andIdEqualTo(record.getId()).andAreaUserIdEqualTo(userId);
        return super.updateByExampleSelective(record,example);
    }

    public CategoryProperty getSelf(long id,long userId) {
        CategoryPropertyExample example = new CategoryPropertyExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<CategoryProperty> listSelf(long categoryId, long userId, Integer page, Integer pageSize) {
        CategoryPropertyExample example = new CategoryPropertyExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId).andAreaUserIdEqualTo(userId);
        return super.selectByExample(example,page,pageSize);
    }
}
