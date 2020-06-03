package com.sunny.base;
import com.github.pagehelper.PageHelper;

import java.util.List;



public abstract class BaseService<T,TExample> implements IService<T,TExample> {

	protected abstract BaseMapper<T,TExample> getMapper();
	@Override
	public List<T> selectByExample(TExample tExample, Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return getMapper().selectByExample(tExample);
	}

	@Override
	public T selectByKey(long id) {
		return getMapper().selectByPrimaryKey(id);
	}

	@Override
	public List<T> selectAll(TExample tExample) {
		return getMapper().selectByExample(tExample);
	}

	@Override
	public T selectOne(TExample tExample) {
		List<T> ts = selectAll(tExample);
		if(ts!=null  && ts.size()>0){
			return ts.get(0);
		}
		return null;
	}

	@Override
	public long countByExample(TExample tExample) {
		return getMapper().countByExample(tExample);
	}

	@Override
	public int save(T record) {
		return getMapper().insert(record);
	}

	@Override
	public int saveSelective(T record) {
		return getMapper().insertSelective(record);
	}

	@Override
	public int updateByKeySelective(T record) {
		return getMapper().updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByKey(T record) {
		return getMapper().updateByPrimaryKey(record);
	}

	@Override
	public int updateByExampleSelective(T record, TExample tExample) {
		return getMapper().updateByExampleSelective(record,tExample);
	}

	@Override
	public int updateByExample(T record, TExample tExample) {
		return getMapper().updateByExample(record,tExample);
	}

	@Override
	public int deleteByExample(TExample tExample) {
		return getMapper().deleteByExample(tExample);
	}

	@Override
	public int deleteByKey(long id) {
		return getMapper().deleteByPrimaryKey(id);
	}
}
