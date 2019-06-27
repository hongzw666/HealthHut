package com.china.HealthHut.appService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.china.HealthHut.appService.AppRegisterService;
import com.china.HealthHut.appmapper.AppRegisterMapper;
import com.china.HealthHut.pojo.Register;

@Service
public class AppRegisterServiceImpl implements AppRegisterService{

	@Autowired
	private AppRegisterMapper appRegisterMapper;

	@Override
	public int addRegister(Register register) {
		return this.appRegisterMapper.addRegister(register);
	}


}
