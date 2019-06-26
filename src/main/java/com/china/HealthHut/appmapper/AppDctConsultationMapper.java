package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.DctConsultation;

public interface AppDctConsultationMapper {
	//根据发送方id、接收方ID查询问诊记录
	List<DctConsultation> findDctConsultationByUidAndFid(String uid, String fid);
	
	//插入问诊记录
	int addDctConsultation(DctConsultation dctConsultation);
	
}
