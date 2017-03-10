package com.suaee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.abel533.mapper.Mapper;
import com.suaee.entity.user.User;

public interface UserMapper{

	/**
	 * 根据用户id查询用户
	 * @param id
	 * @return
	 */
	User queryById(@Param("id")Long id);
	
	/**
	 * 查询所有有效数据，status为1表示用户生效
	 * @return
	 */
	List<User> queryAll();

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	int insert(User user);

	/**
	 * 逻辑删除用户
	 * @param user
	 * @return
	 */
	int deleteUserById(User user);
}
