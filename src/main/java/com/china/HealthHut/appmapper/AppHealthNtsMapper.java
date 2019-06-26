package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.HeathNts;

public interface AppHealthNtsMapper {
	//添加健康记录
	int addHealthNts(HeathNts heathNts);
	
	//根据id删除
	int daleteHealthNts(Integer id);
	
	//根据ID查找
	List<HeathNts> findHeathNtsId(Integer id);
	
	//根据id修改
	int updateHeathNts(HeathNts heathNts);
}
