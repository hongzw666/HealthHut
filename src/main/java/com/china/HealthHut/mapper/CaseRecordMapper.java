package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.CaseRecord;

public interface CaseRecordMapper {

	List<CaseRecord> findCaseRecordList(RowBounds rowBounds);

	CaseRecord findCaseRecordById(int id);

	int deleteCaseRecord(int id);

	int createCaseRecord(CaseRecord caseReord);

	int updateCaseRecord(CaseRecord caseReord);
	
	List<CaseRecord> findCaseRecordAll();

}
