package com.sunny.shop.action;

import cn.hutool.core.date.DateUtil;
import com.sunny.base.*;
import com.sunny.product.model.CategoryParameter;
import com.sunny.product.model.CategoryParameterExample;
import com.sunny.product.model.ProductCategory;
import com.sunny.shop.service.CategoryParameterService;
import com.sunny.shop.service.ProductCategoryService;
import com.sunny.tools.SnowFlakeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create 2020-06-17 01:08:09
*/
@Component
public class CategoryParameterAction extends BaseAction<CategoryParameter,CategoryParameterExample>{
    @Autowired
    CategoryParameterService categoryParameterService;
    @Autowired
    ProductCategoryService productCategoryService;
    @Override
    protected BaseService<CategoryParameter, CategoryParameterExample> getService() {
        return categoryParameterService;
    }

    @Override
    public int save(CategoryParameter record) {
        CategoryParameterExample example = new CategoryParameterExample();
        example.createCriteria().andNameEqualTo(record.getName()).andAreaUserIdEqualTo(record.getAreaUserId());
        long count = countByExample(example);
        if(count>0){
            throw new ApiException(ApiCode.CATEGORY_PARAMETER_EXIST);
        }
        ProductCategory category = productCategoryService.selectByKey(record.getCategoryId());
        if(category == null){
            throw new ApiException(ApiCode.CATEGORY_NOT_EXIST);
        }
        record.setId(SnowFlakeUtils.nextId());
        record.setCreateTime(DateUtil.date());
        record.setStatus(0);
        if(record.getSort() == null){
            record.setSort(0);
        }
        return super.save(record);
    }
    public int deleteSelf(long id,long userId) {
        CategoryParameterExample example = new CategoryParameterExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        CategoryParameter parameter = new CategoryParameter();
        parameter.setId(id);
        parameter.setStatus(BaseStatus.DELETE_STATUS);
        return super.updateByExampleSelective(parameter,example);
    }

    public int updateSelf(CategoryParameter parameter,long userId) {
        CategoryParameterExample example = new CategoryParameterExample();
        example.createCriteria().andIdEqualTo(parameter.getId()).andAreaUserIdEqualTo(userId);
        return super.updateByExampleSelective(parameter,example);
    }

    public CategoryParameter getSelf(long id,long userId) {
        CategoryParameterExample example = new CategoryParameterExample();
        example.createCriteria().andIdEqualTo(id).andAreaUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<CategoryParameter> listSelf(long categoryId, long userId, Integer page, Integer pageSize) {
        CategoryParameterExample example = new CategoryParameterExample();
        example.createCriteria().andCategoryIdEqualTo(categoryId).andAreaUserIdEqualTo(userId)
        .andStatusEqualTo(BaseStatus.NORMAL_STATUS);
        return super.selectByExample(example,page,pageSize);
    }
}
