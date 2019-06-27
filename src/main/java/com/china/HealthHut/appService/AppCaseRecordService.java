package com.china.HealthHut.appService;

import java.util.List;

import com.china.HealthHut.pojo.CaseRecord;

public interface AppCaseRecordService {
	
	//根据学号或工号查询病历
	List<CaseRecord> findCaseRecordBySTnumber(String s_t_number);

	//根据病历ID查询病历
	CaseRecord findCaseRecordById(String id);
	
	
}
