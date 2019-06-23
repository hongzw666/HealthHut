package com.china.HealthHut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.china.HealthHut.pojo.Users;
import com.china.HealthHut.service.UserService;

@Controller
@RequestMapping("/HealthHut")
public class StudentsUsersController {
	@Autowired
	private UserService UserService;
	
	//跳转到User管理页面 ， 并查询出所有的User的页数
	@RequestMapping("/toStudents")
	public String toUser(Model model) {
		int page = this.UserService.findUsersAll("y");
		model.addAttribute("yeshu", page);
		return "students";
	}
	
	//分页查询
	@RequestMapping("/findStudentsList")
	@ResponseBody
	public List<Users>  findUserList(int page){
		List<Users> UserList = this.UserService.findUsersList("y",page*9, 9);
		return UserList;
	}
	
	
	//根据id查找
	@RequestMapping("/findStudentsById")
	@ResponseBody
	public Users  findUserById(int id){
		Users User = this.UserService.findUsersById(id);
		return User;
	}
	
	//删除User
	@RequestMapping("/deleteStudents")
	@ResponseBody
	public String  deleteUser(int id){
		System.out.println(id);
		int count = this.UserService.deleteUsers(id);
		System.out.println(count);
		if (count > 0) {
			return "OK";
		}
		return "";
	}
	
	//更新User
		@RequestMapping("/updateStudents")
		@ResponseBody
		public String updateUser(Users user) {
			int count = this.UserService.updateUsers(user);
			if (count>0) {
				return "OK";
			}
			return "";
		}
	
	//新增User
	@RequestMapping("/createStudents")
	@ResponseBody
	public String  createUser(Users user){
		int count = this.UserService.createUsers(user);
		if (count >0) {
			return "OK";
		}
		return "";
	}
}
