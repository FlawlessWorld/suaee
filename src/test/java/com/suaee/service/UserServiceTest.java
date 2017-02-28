package com.suaee.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.suaee.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/applicationContext.xml", 
	"classpath:spring/applicationContext-mybatis.xml",
	"classpath:spring/applicationContext-transaction.xml" })
public class UserServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceTest.class);
	
	@Autowired
	private UserService userService;

	@Test
	public void testAddUser() {
		LOGGER.info("start test.....");
		User user = new User();
		user.setName("rose");
		user.setAge(20);
		user.setCreateTime(new Date());
		user.setUpdateTime(user.getCreateTime());
		user.setStatus(1);
		boolean ifAddUser = userService.addUser(user);
		System.out.println(ifAddUser);
		LOGGER.info("end test.....");
	}

}
