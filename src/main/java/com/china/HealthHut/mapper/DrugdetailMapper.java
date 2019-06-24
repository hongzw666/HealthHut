package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.Drugdetail;

public interface DrugdetailMapper {
	
	List<Drugdetail> findDrugdetailList(RowBounds rowBounds);

	Drugdetail findDrugdetailById(int id);

	int deleteDrugdetail(int id);

	int createDrugdetail(Drugdetail drugdetail);

	List<Drugdetail> findDrugdetailAll();

	int updateDrugdetail(Drugdetail drugdetail);

	
}