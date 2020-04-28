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
* @create 2020-04-27 12:45
*/
@Component
public class ${UpperClassName}Action extends BaseAction<${UpperClassName},${UpperClassName}Example>{
    @Autowired
    UserService ${lowerClassName}Service;
    @Override
    protected BaseService<${UpperClassName}, ${UpperClassName}Example> getService() {
        return ${lowerClassName}Service;
    }
}
