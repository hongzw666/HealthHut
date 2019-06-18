package com.china.HealthHut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.china.HealthHut.mapper.AdminMapper;
import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminService;

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public Admin findAdmin(String usercode, String password) {
		return adminMapper.findAdmin(usercode, password);
	}

	@Override
	public int addAdmin(String usercode, String username, String password) {
		
		return adminMapper.addAdmin(usercode,username,password);
	}
	
	
}
