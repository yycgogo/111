package com.yyc.action.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Member_del {
	@RequestMapping("/member_del")
	public String del(){
		return "member-del";
	}
}
