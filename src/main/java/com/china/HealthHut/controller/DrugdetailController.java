package com.china.HealthHut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.pojo.Drugdetail;
import com.china.HealthHut.pojo.RecipeMain;
import com.china.HealthHut.service.DrugdetailService;

@Controller
@RequestMapping("/HealthHut")
public class DrugdetailController {
	
	@Autowired
	private DrugdetailService drugdetailService;
	
	//跳转到Drugdetail管理页面 ， 并查询出所有的Drugdetail的页数
	@RequestMapping("/toDrugdetail")
	public String toDrugdetail(Model model) {
		int page = this.drugdetailService.findDrugdetailAll();
		model.addAttribute("yeshu", page);
		return "drugdetail";
	}
	
	//分页查询
	@RequestMapping("/findDrugdetailList")
	@ResponseBody
	public List<Drugdetail>  findDrugdetailList(int page){
		List<Drugdetail> DrugdetailList = this.drugdetailService.findDrugdetailList(page*9, 9);
		return DrugdetailList;
	}
	
	
	//根据id查找
	@RequestMapping("/findDrugdetailById")
	@ResponseBody
	public Drugdetail  findDrugdetailById(int id){
		Drugdetail Drugdetail = this.drugdetailService.findDrugdetailById(id);
		return Drugdetail;
	}
	
	//删除Drugdetail
	@RequestMapping("/deleteDrugdetail")
	@ResponseBody
	public String  deleteDrugdetail(int id){
		int count = this.drugdetailService.deleteDrugdetail(id);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
	//更新RecipeMain
		@RequestMapping("/updateDrugdetail")
		@ResponseBody
		public String updateUser(Drugdetail drugdetail) {
			int count = this.drugdetailService.updateUsers(drugdetail);
			if (count>0) {
				return "OK";
			}
			return "";
		}
	
	//新增Drugdetail
	@RequestMapping("/createDrugdetail")
	@ResponseBody
	public String  createDrugdetail(Drugdetail drugdetail){
		int count = this.drugdetailService.createDrugdetail(drugdetail);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
}
