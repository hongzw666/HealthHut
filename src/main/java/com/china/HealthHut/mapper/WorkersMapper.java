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

	//根据id删除
	int deleteWorkers(String id);

	//新增Workers
	int createWorkers(Workers workers);
	
	//查询所有Workers
	List<Workers> findWorkersAll();

}
