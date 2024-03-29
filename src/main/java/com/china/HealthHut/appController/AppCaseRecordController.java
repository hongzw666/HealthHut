package com.china.HealthHut.appController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppCaseRecordService;
import com.china.HealthHut.pojo.CaseRecord;
import com.google.gson.Gson;

@Controller
@RequestMapping("/HealthHut/App")
public class AppCaseRecordController {
	
	@Autowired
	private AppCaseRecordService appCaseRecordService;
	
	//	根据学号或工号查询病历表集合
	@RequestMapping("/findCaseRecordBySTnumber")
	@ResponseBody
	public String findCaseRecordBySTnumber(String callback, String s_t_number) {
		List<CaseRecord> CaseRecordList = this.appCaseRecordService.findCaseRecordBySTnumber(s_t_number);
		if (!CaseRecordList.equals("[]")) {
			String CaseRecordjson = new Gson().toJson(CaseRecordList);
			return callback+"("+CaseRecordjson+")";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	
	
	//	根据病历ID查询病历表
	@RequestMapping("/findCaseRecordById")
	@ResponseBody
	public String findCaseRecordById(String callback, String case_id) {
		CaseRecord CaseRecord = this.appCaseRecordService.findCaseRecordById(case_id);
		if (CaseRecord != null) {
			String CaseRecordjson = new Gson().toJson(CaseRecord);
			return callback+"("+CaseRecordjson+")";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	
}
