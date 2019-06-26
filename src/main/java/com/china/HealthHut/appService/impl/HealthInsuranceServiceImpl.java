package com.china.HealthHut.appService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.HealthInsuranceService;
import com.china.HealthHut.appmapper.AppHealthInsuranceMapper;
import com.china.HealthHut.pojo.HeathInsurance;

@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService{
	@Autowired
	private AppHealthInsuranceMapper healthInsuranceMapper;
	
	//添加学生医保信息
	@Override
	public int addHealthInsurance(HeathInsurance healthInsurance) {
		return healthInsuranceMapper.addHealthInsurance(healthInsurance);
	}

}
