package com.sunny.shop.action;

import com.sunny.base.ApiCode;
import com.sunny.base.ApiException;
import cn.hutool.core.date.DateUtil;
import com.sunny.tools.SnowFlakeUtils;
import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.${model}.model.${UpperClassName};
import com.sunny.${model}.model.${UpperClassName}Example;
import com.sunny.shop.service.${UpperClassName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @author tec_feng
* @create ${createTime?string('yyyy-MM-dd hh:mm:ss')}
*/
@Component
public class ${UpperClassName}Action extends BaseAction<${UpperClassName},${UpperClassName}Example>{
    @Autowired
    ${UpperClassName}Service ${lowerClassName}Service;
    @Override
    protected BaseService<${UpperClassName}, ${UpperClassName}Example> getService() {
        return ${lowerClassName}Service;
    }

    @Override
    public int save(${UpperClassName} record) {
        ${UpperClassName}Example example = new ${UpperClassName}Example();
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
        ${UpperClassName}Example example = new ${UpperClassName}Example();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.deleteByExample(example);
    }

    public int updateSelf(${UpperClassName} record,long userId) {
        ${UpperClassName}Example example = new ${UpperClassName}Example();
        example.createCriteria().andIdEqualTo(record.getId()).andUserIdEqualTo(userId);
        return super.updateByExampleSelective(record,example);
    }

    public ${UpperClassName} getSelf(long id,long userId) {
        ${UpperClassName}Example example = new ${UpperClassName}Example();
        example.createCriteria().andIdEqualTo(id).andUserIdEqualTo(userId);
        return super.selectOne(example);
    }

    public List<${UpperClassName}> listSelf(long categoryId, long userId, Integer page, Integer pageSize) {
        ${UpperClassName}Example example = new ${UpperClassName}Example();
        example.createCriteria().andCategoryIdEqualTo(categoryId).andUserIdEqualTo(userId);
        return super.selectByExample(example,page,pageSize);
    }
}
