package com.china.HealthHut.appService.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppWorkersService;
import com.china.HealthHut.appmapper.AppWorkersMapper;
import com.china.HealthHut.pojo.Workers;

@Service
public class AppWorkersServiceImpl implements AppWorkersService{

	@Autowired
	private AppWorkersMapper appWorkersMapper;
	
	@Override
	public List<Workers> findWorkersAll() {
		return this.appWorkersMapper.findWorkersAll();
	}
	
	
	//根据ID查询医生详情
	@Override
	public Workers getWorkersById(String workers_id) {
		return this.appWorkersMapper.getWorkersById(workers_id);
	}

}
