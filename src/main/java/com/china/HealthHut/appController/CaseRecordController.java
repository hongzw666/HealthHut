package com.china.HealthHut.appController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.pojo.CaseRecord;

@Controller
@RequestMapping("/HealthHut")
public class CaseRecordController {
	
	@RequestMapping("/findCaseRecordById")
	@ResponseBody
	public CaseRecord findCaseRecordById(String id) {
		
		return null;
	}
}
