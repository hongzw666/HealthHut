package com.china.HealthHut.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.CaseRecordMapper;
import com.china.HealthHut.pojo.CaseRecord;
import com.china.HealthHut.service.CaseRecordService;

@Service
public class CaseRecordServiceImpl implements CaseRecordService {
	@Autowired
	private CaseRecordMapper caseRecordMapper;

	//分页查询CaseRecord
	@Override
	public List<CaseRecord> findCaseRecordList(int page , int limit) {
		List<CaseRecord> caseRecordList = this.caseRecordMapper.findCaseRecordList(new RowBounds(page, limit));
		return caseRecordList;
	}
	
	//根据id查找CaseRecord
	@Override
	public CaseRecord findCaseRecordById(int id) {
		CaseRecord caseRecord = this.caseRecordMapper.findCaseRecordById(id);
		return caseRecord;
	}
	
	//根据id删除CaseRecord
	@Override
	public int deleteCaseRecord(int id) {
		return this.caseRecordMapper.deleteCaseRecord(id);
	}

	// 增加CaseRecord
	@Override
	public int createCaseRecord(CaseRecord caseReord) {
		
		return this.caseRecordMapper.createCaseRecord(caseReord);
	}
}
