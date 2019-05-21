package com.yyc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyc.service.HelloService;
/**  
* Title: HelloAction.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年4月23日  
* @version 1.0  
*/
@Controller
@RequestMapping("/hello")
public class HelloAction {
	@Autowired
	private HelloService service;
	
	@RequestMapping("/he")
	public String hello(){
		service.show();
		System.out.println(111);
		return "login";
	}
	@RequestMapping("/ha")
	public String hello02(){
		service.show();
		return "index";
	}
	@RequestMapping("/member")
	public String hello03(){
		service.show();
		return "member-del";
	}
	
}
