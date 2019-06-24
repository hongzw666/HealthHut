package com.china.HealthHut.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.china.HealthHut.pojo.RecipeMain;
import com.china.HealthHut.service.RecipeMainService;

@Controller
@RequestMapping("/HealthHut")
public class RecipeMainController {
	
	@Autowired
	private RecipeMainService RecipeMainService;
	
	//跳转到RecipeMain管理页面 ， 并查询出所有的RecipeMain的页数
	@RequestMapping("/toRecipeMain")
	public String toRecipeMain(Model model) {
		int page = this.RecipeMainService.findRecipeMainAll();
		model.addAttribute("yeshu", page);
		return "recipeMain";
	}
	
	//分页查询
	@RequestMapping("/findRecipeMainList")
	@ResponseBody
	public List<RecipeMain>  findRecipeMainList(int page){
		List<RecipeMain> RecipeMainList = this.RecipeMainService.findRecipeMainList(page*9, 9);
		return RecipeMainList;
	}
	
	
	//根据id查找
	@RequestMapping("/findRecipeMainById")
	@ResponseBody
	public RecipeMain  findRecipeMainById(int id){
		RecipeMain RecipeMain = this.RecipeMainService.findRecipeMainById(id);
		return RecipeMain;
	}
	
	//删除RecipeMain
	@RequestMapping("/deleteRecipeMain")
	@ResponseBody
	public String  deleteRecipeMain(int id){
		int count = this.RecipeMainService.deleteRecipeMain(id);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	//更新RecipeMain
	@RequestMapping("/updateRecipeMain")
	@ResponseBody
	public String updateUser(RecipeMain recipeMain) {
		System.out.println(recipeMain.getRm_id());
		int count = this.RecipeMainService.updateUsers(recipeMain);
		System.out.println(count);
		if (count>0) {
			return "OK";
		}
		return "";
	}
	
	//新增RecipeMain
	@RequestMapping("/createRecipeMain")
	@ResponseBody
	public String  createRecipeMain(RecipeMain recipeMain){
		System.out.println(recipeMain.toString());
		int count = this.RecipeMainService.createRecipeMain(recipeMain);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
}
