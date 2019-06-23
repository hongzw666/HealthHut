package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.CaseRecord;

public interface CaseRecordService {
	
	//分页查询
	List<CaseRecord> findCaseRecordList(int page, int limit);

	CaseRecord findCaseRecordById(int id);

	int deleteCaseRecord(int id);

	int createCaseRecord(CaseRecord caseReord);

	int findCaseRecordAll();

	int updateCaseRecord(CaseRecord caseReord);
	
}
