package com.china.HealthHut.service;

import com.china.HealthHut.pojo.Admin;

public interface AdminService {

	Admin findAdmin(String usercode, String password);

	int addAdmin(String usercode, String username, String password);
	
}
