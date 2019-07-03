package com.china.HealthHut.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppRegisterService;
import com.china.HealthHut.pojo.Register;

@Controller
@RequestMapping("/HealthHut/App")
public class AppRegisterController {
	
	@Autowired
	private AppRegisterService appRegisterService;
	
	//添加挂号记录
	@RequestMapping("/addRegister")
	@ResponseBody
	public String addRegister(String callback ,Register register) {
		int count = this.appRegisterService.addRegister(register);
		if (count > 0 ) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
