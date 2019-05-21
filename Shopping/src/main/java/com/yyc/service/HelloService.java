package com.yyc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yyc.dao.SysUserDao;
import com.yyc.pojo.SysUser;

/**  
* Title: HelloService.java 
* Description: 
* Copyright: Copyright (c) 2018    
* @author zhh  
* @date 2019年4月23日  
* @version 1.0  
*/
@Service
public class HelloService {
	@Autowired
	private SysUserDao dao;
	
	public void show(){
		System.out.println(dao.findByNameAndPwd("qq", "ww"));
		System.out.println("show");
	}
}
