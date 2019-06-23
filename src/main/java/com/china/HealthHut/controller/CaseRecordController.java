package com.china.HealthHut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.pojo.CaseRecord;
import com.china.HealthHut.service.CaseRecordService;

@Controller
@RequestMapping("HealthHut")
public class CaseRecordController {
	@Autowired
	private CaseRecordService caseRecordService;
	
	@RequestMapping("toCaseRecord")
	public String toCaseRecord() {
		
		return null;
	}
	
	@RequestMapping("findCaseRecordList")
	@ResponseBody
	public List<CaseRecord>  findCaseRecordList(int page){
		List<CaseRecord> caseRecordList = this.caseRecordService.findCaseRecordList(page*9, 9);
		return caseRecordList;
	}
	
	@RequestMapping("findCaseRecordById")
	@ResponseBody
	public CaseRecord  findCaseRecordById(int id){
		CaseRecord caseRecord = this.caseRecordService.findCaseRecordById(id);
		return caseRecord;
	}
	
	@RequestMapping("deleteCaseRecord")
	public String  deleteCaseRecord(int id){
		int count = this.caseRecordService.deleteCaseRecord(id);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
	@RequestMapping("createCaseRecord")
	public String  createCaseRecord(CaseRecord caseReord){
		int count = this.caseRecordService.createCaseRecord(caseReord);
		if (count >0) {
			return "OK";
		}
		return "";
	}
	
}
