package com.finexus.sitecheckengine.engine.pojo;

import java.sql.Time;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class UserSiteHistory {
	
	@Id
	public ObjectId _id;
//	public String userName;
//	public String numberOfURLs;
	public String siteURL;
	public String statusCode;
	public String statusName;
	
//	public Time responseTime;
//	public Time uptime;
//	public Time downTime;
//	
//	StatusName
//	
//	ConnectTime
//	PageSize
//	SiteUrl
//	
	public UserSiteHistory() {}

	
	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getSiteURL() {
		return siteURL;
	}

	public void setSiteURL(String siteURL) {
		this.siteURL = siteURL;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	
	

}
