package com.finexus.sitecheckengine.engine.pojo;

import org.springframework.data.annotation.Id;

public class UserSites {
	
	@Id
	public String id;
	public String userName;
	public String siteURL;
	public String siteName;
	
	public int monitoringInterval;
	
	
	
	public UserSites() {}
	

}
