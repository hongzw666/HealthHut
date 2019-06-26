package com.china.HealthHut.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.appService.HealthInsuranceService;
import com.china.HealthHut.pojo.HeathInsurance;

@Controller
@RequestMapping("/HealthHut")
public class HealthInsuranceController {
	
	@Autowired
	private HealthInsuranceService healthInsuranceService;
	
	@RequestMapping("/addHealthInsurance")
	public String addHealthInsurance(String callback, HeathInsurance heathInsurance) {
		int count = this.healthInsuranceService.addHealthInsurance(heathInsurance);
		if (count > 0 ) {
			return callback+"({\"status\":\"success\"})";
		}
		
		return callback+"({\"status\":\"fail\"})";
	}
	
}
