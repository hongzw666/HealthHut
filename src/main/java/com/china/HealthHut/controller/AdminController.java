package com.china.HealthHut.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminService;

@RequestMapping("/HealthHut")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	//进入管理员登录页面
	@RequestMapping("/toAdminLogin")
	public String  toAdminLogin() {
		return "Login";
	}
	
	@RequestMapping("/adminLogin")
	public String adminLogin(String usercode, String password,Model model, HttpSession session) {
		//查找账号密码是否正确
		Admin findAdmin = adminService.findAdmin(usercode,password);
		if (findAdmin != null ) {
			//账号密码正确
			return "";
		}
		//账号密码错误
		model.addAttribute("msg", "您的账号或密码错误！");
		return "login";
	}
	
	//进入管理员注册页面
	@RequestMapping("/toAddAdmin")
	public String  toAddAdmin() {
		return "register";
	}
	
	//添加管理员
	@RequestMapping("/addAdmin")
	public String addAdmin(String usercode,String username, String password,Model model) {
		//查找当前管理员是否已存在
		Admin findAdmin = adminService.findAdmin(username,password);
		if (findAdmin == null ) {
			//账号不存在，注册管理员
			adminService.addAdmin(usercode,username,password);
			model.addAttribute("msg", "注册成功！");
			return "login";
		}
		//账号已存在，提示用户，重新返回注册页面
		model.addAttribute("msg", "改账号已经存在！");
		return "register";
	}
	
}
