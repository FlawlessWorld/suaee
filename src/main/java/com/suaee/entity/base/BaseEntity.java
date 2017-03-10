package com.suaee.entity.base;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.suaee.util.id.IdGenerator;
import com.suaee.util.id.IdSnowflake;
import com.suaee.util.id.IdWorker;

public class BaseEntity {

	protected Long id;

	protected Short delFlag;

	protected Date createDate;

	protected Date updateDate;
	
	public BaseEntity() {
		this.id = new IdSnowflake().getGenerateId();
		this.delFlag = 1;
		this.createDate = new Date();
		this.updateDate = this.createDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Short delFlag) {
		this.delFlag = delFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
