package com.china.HealthHut.appService.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppHealthNtsService;
import com.china.HealthHut.appmapper.AppHealthNtsMapper;
import com.china.HealthHut.pojo.HeathNts;

@Service
public class AppHealthNtsServiceImpl implements AppHealthNtsService{
	
	@Autowired
	private AppHealthNtsMapper appHealthNtsMapper;
	
	@Override
	public int addHealthNts(HeathNts heathNts) {
		return this.appHealthNtsMapper.addHealthNts(heathNts);
	}

	@Override
	public int deleteHealthNts(Integer id) {
		return this.appHealthNtsMapper.deleteHealthNts(id);
	}

	@Override
	public List<HeathNts> findHeathNtsId(Integer id) {
		return this.appHealthNtsMapper.findHeathNtsId(id);
	}

	@Override
	public int updateHeathNts(HeathNts heathNts) {
		return this.appHealthNtsMapper.updateHeathNts(heathNts);
	}

}
