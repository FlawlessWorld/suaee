package com.suaee.entity.user;

import javax.persistence.Table;

import com.suaee.entity.base.BaseEntity;

@Table(name = "users")
public class User extends BaseEntity {
	// 昵称
	private String nickName;
	// 用户名
	private String userName;
	// 密码
	private String password;
	// 电话
	private String tel;
	// 邮箱
	private String email;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
