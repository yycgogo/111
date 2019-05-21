package com.yyc.action.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAction {
	
	@RequestMapping("/user_del")
	public String del(){
		return "user/user-del";
	}
}
