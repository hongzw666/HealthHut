package com.china.HealthHut.appController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppCaseRecordService;
import com.china.HealthHut.pojo.CaseRecord;

@Controller
@RequestMapping("/HealthHut/App")
public class AppCaseRecordController {
	
	@Autowired
	private AppCaseRecordService appCaseRecordService;
	
	//根据发送方id、接收方ID查询问诊记录
	@RequestMapping("/findCaseRecordBySTnumber")
	@ResponseBody
	public String findCaseRecordBySTnumber(String callback, String s_t_number) {
		List<CaseRecord> CaseRecordList = this.appCaseRecordService.findCaseRecordBySTnumber(s_t_number);
		if (CaseRecordList != null) {
			return callback+"({"+CaseRecordList+"})";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	
	
	//插入问诊记录
	@RequestMapping("/findCaseRecordById")
	@ResponseBody
	public String findCaseRecordById(String callback, String id) {
		CaseRecord CaseRecord = this.appCaseRecordService.findCaseRecordById(id);
		if (CaseRecord != null) {
			return callback+"({"+CaseRecord+"})";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	
}
