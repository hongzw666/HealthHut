package com.china.HealthHut.appService;

import org.springframework.stereotype.Service;

import com.china.HealthHut.pojo.Users;

@Service
public interface AppUserService {
	
	/**
	 * 查找用户账号密码是否正确
	 * @param users
	 * @return users
	 */
	Users findIsHaveUsers(Users users);
	
	/**
	 * 用户注册，添加用户
	 * @param users
	 * @return
	 */
	int addUser(Users users);
	
}
