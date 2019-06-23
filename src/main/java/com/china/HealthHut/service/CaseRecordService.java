package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.CaseRecord;

public interface CaseRecordService {

	List<CaseRecord> findCaseRecordList(int page, int limit);

	CaseRecord findCaseRecordById(int id);

	int deleteCaseRecord(int id);

	int createCaseRecord(CaseRecord caseReord);
	
}
