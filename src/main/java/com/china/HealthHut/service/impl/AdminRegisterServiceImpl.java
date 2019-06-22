package com.china.HealthHut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.AdminRegisterMapper;
import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminRegisterService;

@Service
public class AdminRegisterServiceImpl implements AdminRegisterService{

	@Autowired
	private AdminRegisterMapper adminRegisterMapper;
	
	@Override
	public int addAdmin(Admin admin) {
		int count = this.adminRegisterMapper.addAdmin(admin);
		return count;
	}

		
}
