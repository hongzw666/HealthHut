package com.china.HealthHut.appService;

import java.util.List;

import com.china.HealthHut.pojo.Workers;

public interface AppWorkersService {
	
	//查询所有医生
	List<Workers> findWorkersAll();
	
	//根据ID查询医生详情
	Workers getWorkersById(String workers_id);

}
