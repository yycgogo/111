package com.yyc.action.login;

import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyc.pojo.SysUser;

@Controller
@RequestMapping("/syslogin")
public class Login {
	@RequestMapping("/loginjsp")
	public String loginjsp(){
		return "login";
	}
	@RequestMapping("/dologin")
	public String dologin(SysUser user,Map<String, String> map){
		
        Subject currentUser = SecurityUtils.getSubject();
        // let's login the current user so we can check against roles and permissions:
        //isAuthenticated()判断是否登录过
        if (!currentUser.isAuthenticated()) {//未登录
            UsernamePasswordToken token = 
            		new UsernamePasswordToken(user.getEmail(),user.getPassword());//存储用户名和密码的对象
            token.setRememberMe(true);
            System.out.println(user.getEmail() + "  " + user.getPassword());
            try {
                currentUser.login(token);//进行登录
            } 
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
            	//登录失败
            	map.put("error", "账号或密码错误，请重新输入");
            	return "login";
            }
        }
        Session session = currentUser.getSession();
        session.setAttribute("loginuser", user.getEmail());
		
        return "index";
	}
}

