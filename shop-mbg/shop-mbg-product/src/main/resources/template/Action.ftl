package com.sunny.${model}.action;

import com.sunny.base.BaseAction;
import com.sunny.base.BaseService;
import com.sunny.${model}.model.${UpperClassName};
import com.sunny.${model}.model.${UpperClassName}Example;
import com.sunny.${model}.service.${UpperClassName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
