package com.china.HealthHut.appService.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.appService.AppCaseRecordService;
import com.china.HealthHut.appmapper.AppCaseRecordMapper;
import com.china.HealthHut.pojo.CaseRecord;

@Service
public class AppCaseRecordServiceImpl implements AppCaseRecordService{
	
	@Autowired
	private AppCaseRecordMapper appCaseRecordMapper;
	
	@Override
	public List<CaseRecord> findCaseRecordBySTnumber(String s_t_number) {
		return appCaseRecordMapper.findCaseRecordBySTnumber(s_t_number);
	}
	
	@Override
	public CaseRecord findCaseRecordById(String id) {
		return this.appCaseRecordMapper.findCaseRecordById(id);
	}
		
}
