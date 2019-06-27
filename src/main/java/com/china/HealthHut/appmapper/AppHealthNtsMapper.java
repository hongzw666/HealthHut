package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.HeathNts;

public interface AppHealthNtsMapper {
	//添加健康记录
	int addHealthNts(HeathNts heathNts);
	
	//根据id删除
	int deleteHealthNts(Integer id);
	
	//根据学号或工号查找
	List<HeathNts> findHeathNtsId(Integer s_t_number);
	
	//根据id修改
	int updateHeathNts(HeathNts heathNts);
}
