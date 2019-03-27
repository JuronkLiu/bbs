package com.bbs.common;

import java.util.List;

/**
 * @ClassName: CommonMapper.java 
 * @Description: 公有的Mapper接口
 * @author: liuzhirong 
 * @Date: 2019年3月13日 下午5:40:26
 */
public interface CommonMapper<T> {
	
	// 添加
	Integer save(T t);

	// 删除
	int delete(Integer id);

	// 修改
	Integer update(T t);

	// 按id查询
	T getById(Integer id);

	// 查询全部数量
	Integer getTotalCount();

	// 查询全部信息
	List<T> getAll();

}
