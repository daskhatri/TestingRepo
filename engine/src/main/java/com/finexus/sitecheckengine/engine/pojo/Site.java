package com.finexus.sitecheckengine.engine.pojo;

import org.springframework.data.annotation.Id;

public class Site {
	
	@Id
	public String id;
	
	String Url;
	String siteName;
	
	public Site() {}
	
}
