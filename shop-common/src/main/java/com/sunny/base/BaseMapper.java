package com.sunny.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author  tec_feng
 * @date 2020/4/11
 */

public interface BaseMapper<T,TExample> {
    long countByExample(TExample example);

    int deleteByExample(TExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(TExample example);

    T selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") TExample example);

    int updateByExample(@Param("record") T record, @Param("example") TExample example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
