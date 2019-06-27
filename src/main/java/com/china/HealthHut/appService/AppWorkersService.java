package com.china.HealthHut.appService;

import java.util.List;

import com.china.HealthHut.pojo.Workers;

public interface AppWorkersService {
	
	//查询所有医生
	List<Workers> findWorkersAll();

}
