package com.china.HealthHut.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.china.HealthHut.appService.AppUserService;
import com.china.HealthHut.pojo.Users;

@Controller
@RequestMapping("/HealthHut")
public class UserLoginConcroller {
	
	@Autowired
	private AppUserService appUserService;
	
	@RequestMapping("/userLogin")
	public String userLogin(Users users) {
		Users haveUser = this.appUserService.findIsHaveUsers(users);
		if (haveUser != null) {
			return "OK";
		}
		return "";
	}
}
