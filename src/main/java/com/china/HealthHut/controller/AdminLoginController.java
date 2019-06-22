package com.china.HealthHut.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminLoginService;

@Controller
@RequestMapping("HealthHut")
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	//管理员登录界面
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "adminLogin";
	}
	
	//管理员登录验证
	@RequestMapping("/adminLogin")
	public String adminLogin (String usercode, String password, Model model, HttpSession session) {
		Admin admin = this.adminLoginService.findAdmin(usercode, password);
		if (admin != null) {
			session.setAttribute("ADMIN_SESSION", admin);
			//若账号密码正确，进入后台管理系统
			return "redirect:toWorkers";
		}
		//账号密码错误
		model.addAttribute("msg", "您的账号或密码错误！");
		return "adminLogin";
	}
}