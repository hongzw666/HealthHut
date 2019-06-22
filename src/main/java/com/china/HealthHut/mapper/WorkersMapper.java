package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.Workers;

public interface WorkersMapper {
	//查询所有
	List<Workers> findWorkersList(RowBounds rowBouns);
	
	//通过id查询
	Workers getWorkersById(String id);
	
	//更新Worker
	int update(Workers worker);

	int deleteWorkers(String id);

	int createWorkers(Workers workers);

	List<Workers> findWorkersAll();

}
