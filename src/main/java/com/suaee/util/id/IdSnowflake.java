package com.suaee.util.id;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdSnowflake {
	
	@Resource
	private IdGenerator idGenerator;
	
/*	private IdSnowflake() {

	}*/

//	private static final IdGenerator idGenerate = new IdGenerator(1);

	public final Long getGenerateId() {
		return idGenerator.nextId();
	}
}
