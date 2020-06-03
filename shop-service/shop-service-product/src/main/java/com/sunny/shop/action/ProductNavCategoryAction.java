package com.sunny.shop.action;

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
        record.setId(SnowFlakeUtils.nextId());
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
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.deleteByExample(example);
    }

    public int updateSelf(ProductNavCategory navCategory,long userId) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andIdEqualTo(navCategory.getId()).andUserIdEqualTo(userId);
        return super.updateByExampleSelective(navCategory,example);
    }

    public ProductNavCategory getSelf(long id,long userId) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<ProductNavCategory> listSelf(long parentId, long userId,Integer page,Integer pageSize) {
        ProductNavCategoryExample example = new ProductNavCategoryExample();
        example.createCriteria().andParentIdEqualTo(parentId).andUserIdEqualTo(userId);
        return super.selectByExample(example,page,pageSize);
    }
}
