package com.sunny.base;
import java.util.List;



public class BaseService<T,TExample> implements IService<T,TExample> {


	@Override
	public List<T> selectByExample(TExample tExample, Integer pageSize, Integer pageNum) {
		return null;
	}

	@Override
	public T selectByKey(Integer id) {
		return null;
	}

	@Override
	public List<T> selectAll(TExample tExample) {
		return null;
	}

	@Override
	public T selectOne(TExample tExample) {
		return null;
	}

	@Override
	public long countByExample(TExample tExample) {
		return 0;
	}

	@Override
	public int save(T record) {
		return 0;
	}

	@Override
	public int saveSelective(T record) {
		return 0;
	}

	@Override
	public int updateByKeySelective(T record) {
		return 0;
	}

	@Override
	public int updateByKey(T record) {
		return 0;
	}

	@Override
	public int updateByExampleSelective(T record, TExample tExample) {
		return 0;
	}

	@Override
	public int updateByExample(T record, TExample tExample) {
		return 0;
	}

	@Override
	public int deleteByExample(TExample tExample) {
		return 0;
	}
}
