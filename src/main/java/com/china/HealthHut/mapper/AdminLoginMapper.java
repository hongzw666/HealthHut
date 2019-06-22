package com.china.HealthHut.mapper;

import com.china.HealthHut.pojo.Admin;

public interface AdminLoginMapper {

	Admin findAdmin(String adm_code, String adm_password);
	
}
