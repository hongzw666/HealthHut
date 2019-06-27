package com.china.HealthHut.appController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.china.HealthHut.appService.AppDctConsultationService;
import com.china.HealthHut.pojo.DctConsultation;

@Controller
@RequestMapping("/HealthHut/App")
public class AppDctConsultationController {
	
	@Autowired
	private AppDctConsultationService appDctConsultationService;
	
	//	根据学号或工号查询病历表
	@RequestMapping("/findDctConsultationByUidAndFid")
	@ResponseBody
	public String findDctConsultationByUidAndFid(String callback, String uid, String fid) {
		List<DctConsultation> DctConsultationList = this.appDctConsultationService.findDctConsultationByUidAndFid(uid,fid);
		if (DctConsultationList != null) {
			return callback+"({"+DctConsultationList+"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//	根据病历ID查询病历表
	@RequestMapping("/addDctConsultation")
	@ResponseBody
	public String addDctConsultation(String callback, DctConsultation dctConsultation) {
		int count = this.appDctConsultationService.addDctConsultation(dctConsultation);
		if (count >0) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
}
