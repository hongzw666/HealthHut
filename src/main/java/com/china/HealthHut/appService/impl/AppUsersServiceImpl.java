package com.china.HealthHut.appService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppUserService;
import com.china.HealthHut.appmapper.AppUsersMapper;
import com.china.HealthHut.pojo.Users;

@Service
public class AppUsersServiceImpl implements AppUserService{
	@Autowired
	private AppUsersMapper appUserMapper;
	
	@Override
	public Users findIsHaveUsers(Users users) {
		return this.appUserMapper.findIsHaveUsers(users);
	}

	@Override
	public int addUser(Users users) {
		return this.appUserMapper.addUser(users);
	}
	
}
