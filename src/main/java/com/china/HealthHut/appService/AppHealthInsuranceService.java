package com.china.HealthHut.appService;

import com.china.HealthHut.pojo.HeathInsurance;

public interface AppHealthInsuranceService {
	//学生医保录入
	int addHealthInsurance(HeathInsurance healthInsurance);
	
	//根据学号查询医保资料
	HeathInsurance findHealthInsuranceBySTNumber(String st_number);
}
