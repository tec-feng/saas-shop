package com.sunny.base;

import java.util.List;

/**
 * @author tec_feng
 * @create 2020-04-27 12:41
 */
public abstract class BaseAction<T,TExample> {

    protected abstract BaseService<T,TExample> getService();
    public List<T> selectByExample(TExample tExample, Integer pageNum, Integer pageSize) {
        return getService().selectByExample(tExample,pageNum,pageSize);
    }

    public T selectByKey(Integer id) {
        return getService().selectByKey(id);
    }

    public List<T> selectAll(TExample tExample) {
        return getService().selectAll(tExample);
    }

    public long countByExample(TExample tExample) {
        return getService().countByExample(tExample);
    }

    public int save(T record) {
        return getService().save(record);
    }

    public int saveSelective(T record) {
        return getService().saveSelective(record);
    }

    public int updateByKeySelective(T record) {
        return getService().updateByKeySelective(record);
    }

    public int updateByKey(T record) {
        return getService().updateByKey(record);
    }

    public int updateByExampleSelective(T record, TExample tExample) {
        return getService().updateByExampleSelective(record,tExample);
    }

    public int updateByExample(T record, TExample tExample) {
        return getService().updateByExample(record,tExample);
    }

    public int deleteByExample(TExample tExample) {
        return getService().deleteByExample(tExample);
    }

    public int deleteByKey(Integer id) {
        return getService().deleteByKey(id);
    }
}
