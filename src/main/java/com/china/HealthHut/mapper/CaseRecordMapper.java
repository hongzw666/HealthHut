package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.CaseRecord;

public interface CaseRecordMapper {
	
	//分页查询CaseRecord
	public List<CaseRecord> findCaseRecordList(RowBounds rowBounds);

	//根据ID查询CaseRecord
	public CaseRecord findCaseRecordById(int id);

	//根据id删除CaseRecord
	public int deleteCaseRecord(int id);

	//新增CaseRecord
	public int createCaseRecord(CaseRecord caseReord);

}
