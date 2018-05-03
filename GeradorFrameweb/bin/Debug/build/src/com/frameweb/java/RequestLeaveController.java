package com.frameweb.java;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "requestLeaveForm")
@SessionScoped
public class RequestLeaveController {
private Request request;

public Request getRequest(){
	return request;
}

public void setRequest(Request _request){
	request = _request;
}

	public RequestLeaveController(){
		
	}

	public String submit(){
		return null;
	}
	
}