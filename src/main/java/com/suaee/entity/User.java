package com.suaee.entity;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
public class User {

	@Id
	private Long id;

	private String name;

	private Integer age;
	
	private String tel;
	
	private String address;
	// 创建时间
	private Date createTime;
	// 更改时间
	private Date updateTime;
	// 数据逻辑存在符号 0表示逻辑删除 1表示数据存在
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", tel=" + tel + ", address=" + address + ", createTime=" + createTime + ", updateTime=" + updateTime + ", status=" + status + "]";
	}

}
