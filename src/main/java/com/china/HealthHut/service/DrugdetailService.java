package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.Drugdetail;

public interface DrugdetailService {
	
	//分页查询
	List<Drugdetail> findDrugdetailList(int page, int limit);

	Drugdetail findDrugdetailById(int id);

	int deleteDrugdetail(int id);

	int createDrugdetail(Drugdetail drugdetail);

	int findDrugdetailAll();
	
}
