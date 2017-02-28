package com.suaee.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.suaee.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml",
	"classpath:spring/applicationContext-mybatis.xml"})
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testAdd() {
		User user = new User();
		user.setName("jack2");
		user.setAge(20);
		user.setCreateTime(new Date());
		user.setUpdateTime(user.getCreateTime());
		user.setStatus(1);
		int insert = userMapper.insert(user);
		System.out.println(insert);
	}

}
