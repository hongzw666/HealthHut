package com.china.HealthHut.appService.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppDctConsultationService;
import com.china.HealthHut.appmapper.AppDctConsultationMapper;
import com.china.HealthHut.pojo.DctConsultation;

@Service
public class AppDctConsultationServiceImpl implements AppDctConsultationService{

	@Autowired
	private AppDctConsultationMapper appDctConsultationMapper;
	
	@Override
	public List<DctConsultation> findDctConsultationByUidAndFid(String uid, String fid) {
		return this.appDctConsultationMapper.findDctConsultationByUidAndFid(uid, fid);
	}

	@Override
	public int addDctConsultation(DctConsultation dctConsultation) {
		return this.appDctConsultationMapper.addDctConsultation(dctConsultation);
	}

}
