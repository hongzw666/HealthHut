package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.CaseRecord;

public interface CaseRecordMapper {
	//分页查询
	List<CaseRecord> findCaseRecordList(RowBounds rowBounds);
	//根据ID查询
	CaseRecord findCaseRecordById(int id);
	//根据ID删除
	int deleteCaseRecord(int id);
	//创建新CaseRecord
	int createCaseRecord(CaseRecord caseReord);
	//根据id更新CaseRecord
	int updateCaseRecord(CaseRecord caseReord);
	//查询所有的CaseRecord
	List<CaseRecord> findCaseRecordAll();

}
