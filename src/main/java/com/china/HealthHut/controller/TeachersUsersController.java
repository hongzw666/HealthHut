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
public class TeachersUsersController {
	@Autowired
	private UserService UserService;
	
	//跳转到User管理页面 ， 并查询出所有的User的页数
	@RequestMapping("/toTeachers")
	public String toUser(Model model) {
		int page = this.UserService.findUsersAll("n");
		model.addAttribute("yeshu", page);
		return "teachers";
	}
	
	//分页查询
	@RequestMapping("/findTeachersList")
	@ResponseBody
	public List<Users>  findUserList(int page){
		List<Users> UserList = this.UserService.findUsersList("n",page*9, 9);
		return UserList;
	}
	
	
	//根据id查找
	@RequestMapping("/findTeachersById")
	@ResponseBody
	public Users  findUserById(int id){
		Users User = this.UserService.findUsersById(id);
		return User;
	}
	
	//删除User
	@RequestMapping("/deleteTeachers")
	@ResponseBody
	public String  deleteUser(int id){
		int count = this.UserService.deleteUsers(id);
		if (count > 0) {
			return "OK";
		}
		return "";
	}
	
	//更新User
		@RequestMapping("/updateTeachers")
		@ResponseBody
		public String updateUser(Users user) {
			System.out.println("ddsd");
			int count = this.UserService.updateUsers(user);
			System.out.println("ddswwwwww");
			if (count>0) {
				return "OK";
			}
			return "";
		}
	
	//新增User
	@RequestMapping("/createTeachers")
	@ResponseBody
	public String  createUser(Users user){
		int count = this.UserService.createUsers(user);
		if (count >0) {
			return "OK";
		}
		return "";
	}
}
