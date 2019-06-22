package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.Workers;

public interface WorkersService {

	List<Workers> findWorkersList(int page,int limit);

	Workers getWorkersById(String id);

	int update(Workers worker);

	int deleteWorkers(String id);

	int createWorkers(Workers workers);

	List<Workers> findWorkersAll();
	
}
