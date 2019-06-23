package com.china.HealthHut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.pojo.CaseRecord;
import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.CaseRecordService;

@Controller
@RequestMapping("/HealthHut")
public class CaseRecordController {
	@Autowired
	private CaseRecordService caseRecordService;
	
	//跳转到CaseRecord管理页面 ， 并查询出所有的CaseRecord的页数
	@RequestMapping("/toCaseRecord")
	public String toCaseRecord(Model model) {
		int page = this.caseRecordService.findCaseRecordAll();
		model.addAttribute("yeshu", page);
		return "caseRecord";
	}
	
	//分页查询
	@RequestMapping("/findCaseRecordList")
	@ResponseBody
	public List<CaseRecord>  findCaseRecordList(int page){
		List<CaseRecord> caseRecordList = this.caseRecordService.findCaseRecordList(page*9, 9);
		return caseRecordList;
	}
	
	
	//根据id查找
	@RequestMapping("/findCaseRecordById")
	@ResponseBody
	public CaseRecord  findCaseRecordById(int id){
		CaseRecord caseRecord = this.caseRecordService.findCaseRecordById(id);
		return caseRecord;
	}
	
	//删除CaseRecord
	@RequestMapping("/deleteCaseRecord")
	@ResponseBody
	public String  deleteCaseRecord(int id){
		System.out.println(id);
		int count = this.caseRecordService.deleteCaseRecord(id);
		System.out.println(count);
		if (count > 0) {
			return "OK";
		}
		return "";
	}
	
	//更新CaseRecord
		@RequestMapping("/updateCaseRecord")
		@ResponseBody
		public String updateCaseRecord( CaseRecord caseReord) {
			int count = this.caseRecordService.updateCaseRecord(caseReord);
			if (count>0) {
				return "OK";
			}
			return "";
		}
	
	//新增CaseRecord
	@RequestMapping("/createCaseRecord")
	@ResponseBody
	public String  createCaseRecord(CaseRecord caseReord){
		int count = this.caseRecordService.createCaseRecord(caseReord);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
}
