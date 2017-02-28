package com.suaee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.suaee.entity.User;

public interface UserMapper extends Mapper<User> {

	/**
	 * 根据用户id查询用户
	 * @param id
	 * @return
	 */
	User queryById(@Param("id")Integer id);
	
	/**
	 * 查询所有有效数据，status为1表示用户生效
	 * @return
	 */
	List<User> queryAll();
}
