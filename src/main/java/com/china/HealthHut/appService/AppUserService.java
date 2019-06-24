package com.china.HealthHut.appService;

import org.springframework.stereotype.Service;

import com.china.HealthHut.pojo.Users;

@Service
public interface AppUserService {
	
	//查找用户账号密码是否正确
	Users findIsHaveUsers(Users users);
	
}
