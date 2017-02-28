package com.suaee.service;

import java.util.List;

import com.suaee.entity.User;

public interface UserService {

	/**
	 * 添加一个用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);

	/**
	 * 查询所有用户信息
	 * @return
	 */
	List<User> queryAll();

	/**
	 * 根据用户id删除用户
	 * @param id
	 * @return
	 */
	boolean deleteUserById(Integer id);
}
