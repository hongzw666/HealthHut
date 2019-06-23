package com.china.HealthHut.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.WorkersMapper;
import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.WorkersService;
@Service
public class WorkersServiceImpl implements WorkersService{
	
	@Autowired
	private WorkersMapper workersMapper;
	
	//分页查询Workers
	@Override
	public List<Workers> findWorkersList(int page,int limit) {
		return this.workersMapper.findWorkersList(new RowBounds(page, limit));
	}
	
	//查询所有Workers
	@Override
	public List<Workers> findWorkersAll() {
		List<Workers> workersAll = this.workersMapper.findWorkersAll();
		return workersAll;
	}
	
	//通过Id查询Workers
	@Override
	public Workers getWorkersById(String id) {
		Workers workersById = this.workersMapper.getWorkersById(id);
		return workersById;
	}
	
	//更新Workers
	@Override
	public int update(Workers worker) {
		int count = this.workersMapper.update(worker);
		return count;
	}
	
	//删除Workers
	@Override
	public int deleteWorkers(String id) {
		int count = this.workersMapper.deleteWorkers(id);
		return count;
	}
	
	//创建Workers
	@Override
	public int createWorkers(Workers workers) {
		int count = this.workersMapper.createWorkers(workers);
		return count;
	}
}
