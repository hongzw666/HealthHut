package com.china.HealthHut.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppUserService;
import com.china.HealthHut.pojo.Users;

@Controller
@RequestMapping("/HealthHut/App")
public class UserLoginConcroller {
	
	@Autowired
	private AppUserService appUserService;
	
	//用户登录验证账号密码是否正确
	@RequestMapping("/userLogin")
	@ResponseBody
	public String userLogin(String callback ,Users users) {
		Users haveUser = this.appUserService.findIsHaveUsers(users);
		if (haveUser != null) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//用户注册
	@RequestMapping("/userRegister")
	@ResponseBody
	public String userRegister(String callback ,Users users) {
		Users haveUser = this.appUserService.findIsHaveUsers(users);
		if (haveUser == null) {
			int count = this.appUserService.addUser(users);
			if (count >0) {
				return callback+"({\"status\":\"success\"})";
			}
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
