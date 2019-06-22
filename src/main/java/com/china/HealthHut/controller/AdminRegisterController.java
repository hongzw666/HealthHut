package com.china.HealthHut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminLoginService;
import com.china.HealthHut.service.AdminRegisterService;

@Controller
@RequestMapping("HealthHut")
public class AdminRegisterController {
	
	@Autowired
	private AdminRegisterService adminRegisterService;
	@Autowired
	private AdminLoginService adminLoginService;
	
	//进入注册页面
	@RequestMapping("/toAdminRegister")
	public String toAdminRegister() {
		
		return "adminRegister";
	}
	
	//注册用户
	@RequestMapping("/adminRegister")
	public String adminRegister(Admin admin, Model model ) {
		int count = 0 ;
		//查询管理员账号是否存在
		Admin findAdmin = this.adminLoginService.findAdmin(admin.getAdm_code(), admin.getAdm_password());
		
		if (admin != null && findAdmin == null) {
			//若管理员账号还未注册过，用户输入的信息不为空，则注册管理员账号
			count = this.adminRegisterService.addAdmin(admin);
			model.addAttribute("msg", "注册成功！");
			return "adminLogin";
		}
		model.addAttribute("msg", "该账号密码已存在！");
		return "adminRegister";
	}
}
