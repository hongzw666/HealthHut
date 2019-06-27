package com.china.HealthHut.appService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppHealthInsuranceService;
import com.china.HealthHut.appmapper.AppHealthInsuranceMapper;
import com.china.HealthHut.pojo.HeathInsurance;

@Service
public class AppHealthInsuranceServiceImpl implements AppHealthInsuranceService{
	@Autowired
	private AppHealthInsuranceMapper healthInsuranceMapper;
	
	//添加学生医保信息
	@Override
	public int addHealthInsurance(HeathInsurance healthInsurance) {
		return this.healthInsuranceMapper.addHealthInsurance(healthInsurance);
	}
	
	//根据学号查询医保资料
	@Override
	public HeathInsurance findHealthInsuranceBySTNumber(String st_number) {
		
		return this.healthInsuranceMapper.findHealthInsuranceBySTNumber(st_number);
	}

}
