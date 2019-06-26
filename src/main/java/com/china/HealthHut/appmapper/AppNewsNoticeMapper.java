package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.NewsNotice;

public interface AppNewsNoticeMapper {
	//查询所有推送资讯
	List<NewsNotice> findNewsNoticeAll();
	
	//模糊查询推送资讯
	List<NewsNotice> findNewsNoticeLikeAll(String context);
	
}
