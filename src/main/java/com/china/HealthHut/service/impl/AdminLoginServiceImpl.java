package com.china.HealthHut.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.AdminLoginMapper;
import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService{
	
	@Autowired
	private AdminLoginMapper adminLoginMapper;

	@Override
	public Admin findAdmin(String usercode, String password) {
		Admin admin = this.adminLoginMapper.findAdmin(usercode, password);
		return admin;
	}
	
}
