package com.sunny.base;
import java.util.List;

public interface IService<T,TExample> {

	/**
	 * 根据实体属性进行分页查询
	 * @param example	实体
	 * @param pageSize 每页数量
	 * @param pageNum	页码
	 * @return
	 */
	List<T> selectByExample(TExample example,Integer pageSize, Integer pageNum);

	/**
	 * 根据主键查询
	 * @param  id 主键id
	 * @return
	 */
	T selectByKey(String id);

	/**
	 * 根据实体属性查询所有数据
	 * @param example 实体
	 * @return
	 */
	List<T> selectAll(TExample example);

	/**
	 * 根据实体属性查询单个数据
	 * @param example 实体
	 * @return
	 */
	T selectOne(TExample example);

	/**
	 * 根据实体属性查询数据
	 * @param example 实体
	 * @return
	 */
	long countByExample(TExample example);

	/**
	 * 保存实体，所有的字段都会添加一遍即使没有值
	 * @param record 实体
	 * @return
	 */
	int save(T record);

	/**
	 * 保存实体，只给有值的字段赋值
	 * @param record 实体
	 * @return
	 */
	int saveSelective(T record);



	/**
	 * 根据主键更新属性,null 不保存
	 * @param record	实体
	 * @return
	 */
	int updateByKeySelective(T record);

	/**
	 * 根据主键更新属性,null 不保存
	 * @param record	实体
	 * @return
	 */
	int updateByKey(T record);

	/**
	 * 根据搜索条件更新属性,null不更新
	 * @param record	实体
	 * @return
	 */
	int updateByExampleSelective(T record, TExample example);

	/**
	 * 根据搜索条件更新属性,null也更新
	 * @param record	实体
	 * @return
	 */
	int updateByExample(T record, TExample example);

	/**
	 * 根据Example条件删除数据
	 * @param example
	 * @return
	 */
	int deleteByExample(TExample example);

	/**
	 * 根据id删除数据
	 * @param id
	 * @return
	 */
	int deleteByKey(String id);

}
