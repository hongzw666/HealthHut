package com.china.HealthHut.appmapper;

import com.china.HealthHut.pojo.HeathInsurance;

public interface AppHealthInsuranceMapper {

	// 添加学生医保信息
	int addHealthInsurance(HeathInsurance healthInsurance);

	// 根据学号查询学生医保信息
	HeathInsurance findHealthInsuranceBySTNumber(String st_number);

}
