package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.CaseRecord;

public interface AppCaseRecordMapper {

	// 根据学号或工号查询病历
	List<CaseRecord> findCaseRecordBySTnumber(String s_t_number);

	// 根据ID查找病历
	CaseRecord findCaseRecordById(String case_id);

}
