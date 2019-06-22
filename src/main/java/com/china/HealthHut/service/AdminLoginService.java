package com.china.HealthHut.service;

import com.china.HealthHut.pojo.Admin;

public interface AdminLoginService {

	Admin findAdmin(String usercode, String password);
	
}
