package com.china.HealthHut.mapper;

import com.china.HealthHut.pojo.Admin;

public interface AdminMapper {
	//增加管理员
	Admin findAdmin(String username, String password);
	
	//查找管理员
	int addAdmin(String usercode, String username, String password);

}
