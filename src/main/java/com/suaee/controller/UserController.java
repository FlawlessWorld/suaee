package com.suaee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.suaee.entity.User;
import com.suaee.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	private ObjectMapper mapper = new ObjectMapper();

	/**
	 * 用户列表页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "", "/list" })
	public String listUser(Model model) {
		// 所有用户信息
		List<User> users = userService.queryAll();
		model.addAttribute("users", users);
		return "userList";
	}

	/**
	 * 跳转到用户添加页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/addUserPage")
	public String addUserPage(User user, Model model) {
		model.addAttribute("user", user);
//		return "addUser";
		return "addUserNg";
	}
	
	/**
	 * 通过Angularjs保存用户信息
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/saveByAngularJs", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> saveByAngularJs(@RequestBody User user ) {
		
		// 调用service层保存数据
		boolean addUserFlag = userService.addUser(user);
		if (addUserFlag) {
			// 重定向到用户列表
			return ResponseEntity.status(HttpStatus.OK).build();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
	}

	/**
	 * 保存用户信息，然后重定向到用户列表页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user, Model model) {
		// 调用service层保存数据
		boolean addUserFlag = userService.addUser(user);
		if (addUserFlag) {
			// 重定向到用户列表
			return "redirect:list";
		}
		model.addAttribute("message", "添加用户失败！");
		return "forward:addUserPage";
	}

	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") Integer id, Model model) {
		// 调用service层删除用户信息
		boolean deleteUserFlag = userService.deleteUserById(id);
		if (deleteUserFlag) {
			// 重定向到用户列表
			return "redirect:list";
		}
		model.addAttribute("message", "删除用户失败！");
		return "forward:list";
	}
	
}
