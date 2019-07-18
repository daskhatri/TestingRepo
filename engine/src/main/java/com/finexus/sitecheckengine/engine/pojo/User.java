package com.finexus.sitecheckengine.engine.pojo;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	public String emailAddress;
	
	public User() {}
	
	
	
}
