package com.suaee.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.suaee.entity.user.User;
import com.suaee.mapper.UserMapper;
import com.suaee.util.MD5Utils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml",
	"classpath:spring/applicationContext-mybatis.xml"})
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);
	
	@Test
	public void testAddUser() {
		User user = new User();
		user.setNickName("管理员2");
		user.setUserName("admin2");
		user.setPassword(MD5Utils.getMD5String("admin2"));
		user.setTel("13855556666");
		user.setEmail("admin@gmail.com");
		userService.addUser(user);
		System.out.println(user);
	}

	@Test
	public void testQueryAll() {
		LOGGER.info("start testQueryAll......");
		List<User> users = userService.queryAll();
		for (User user : users) {
			System.out.println(user);
		}
		LOGGER.info("end testQueryAll......");
	}

	@Test
	public void testDeleteUserById() {
		boolean deleteUserById = userService.deleteUserById(23801158539677696L);
		System.out.println("*************************" + deleteUserById);
		testQueryAll();
	}
	
	@Test
	public void testQueryUserById(){
		User queryUserById = userService.queryUserById(23801158539677696L);
		LOGGER.info("User=={}",queryUserById);
	}

}
