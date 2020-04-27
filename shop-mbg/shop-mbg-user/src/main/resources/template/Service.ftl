package com.sunny.${model}.service;

import com.sunny.base.BaseMapper;
import com.sunny.base.BaseService;
import com.sunny.${model}.mapper.${UpperClassName}Mapper;
import com.sunny.${model}.model.${UpperClassName};
import com.sunny.${model}.model.${UpperClassName}Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*
* @author tec_feng
* @create 2020-04-11 13:28
*/
@Service
public class ${UpperClassName}Service extends BaseService<${UpperClassName},${UpperClassName}Example>{
    @Autowired
    ${UpperClassName}Mapper ${lowerClassName}Mapper;
@Override
    protected BaseMapper<${UpperClassName}, ${UpperClassName}Example> getMapper() {
    return userMapper;
    }
}