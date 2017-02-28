package com.suaee.service.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suaee.entity.User;
import com.suaee.mapper.UserMapper;
import com.suaee.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean addUser(User user) {
		
		LOGGER.info("添加用户,user={}",user);
		// 设置创建时间
		user.setCreateTime(new Date());
		// 设置更新时间
		user.setUpdateTime(user.getCreateTime());
		// 设置默认状态为1，表示数据生效
		user.setStatus(1);
		//调用通用mapper的方法添加一个用户信息，添加成功返回TRUE，否则返回FALSE
		return userMapper.insert(user) == 1;
		
	}

	@Override
	public List<User> queryAll() {
		List<User> users = userMapper.queryAll();
		return users;
	}

	@Override
	public boolean deleteUserById(Integer id) {
		
		LOGGER.info("删除用户,userId={}",id);
		
		User user = userMapper.queryById(id);
		
		if(user == null){
			LOGGER.info("要删除的用户不存在,userId={}",id);
			return false;
		}
		// 设置更新时间
		user.setUpdateTime(new Date());
		// 设置逻辑状态为0，表示数据失效
		user.setStatus(0);
		//调用通用mapper的方法添加一个用户信息，添加成功返回TRUE，否则返回FALSE
		return userMapper.updateByPrimaryKey(user) == 1;
	}
}
