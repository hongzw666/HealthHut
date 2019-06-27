package com.china.HealthHut.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.appService.AppHealthInsuranceService;
import com.china.HealthHut.pojo.HeathInsurance;

@Controller
@RequestMapping("/HealthHut/App")
public class AppHealthInsuranceController {
	
	@Autowired
	private AppHealthInsuranceService healthInsuranceService;
	
	//添加医保信息
	@RequestMapping("/addHealthInsurance")
	public String addHealthInsurance(String callback, HeathInsurance heathInsurance) {
		int count = this.healthInsuranceService.addHealthInsurance(heathInsurance);
		if (count > 0 ) {
			return callback+"({\"status\":\"success\"})";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	//根据学号查找医保资料
	@RequestMapping("/findHealthInsuranceBySTNumber")
	public String findHealthInsuranceBySTNumber(String callback,String st_number) {
		HeathInsurance heathInsurance = this.healthInsuranceService.findHealthInsuranceBySTNumber(st_number);
		
		if (heathInsurance != null) {
			return callback+"({"+heathInsurance+"})";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
}
