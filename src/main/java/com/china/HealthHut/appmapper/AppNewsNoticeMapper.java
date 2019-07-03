package com.china.HealthHut.appmapper;

import java.util.List;

import com.china.HealthHut.pojo.NewsNotice;

public interface AppNewsNoticeMapper {

	// 查询所有推送资讯
	List<NewsNotice> findNewsNoticeAll();
	
	// 根据标题（title） 模糊查询推送资讯
	List<NewsNotice> findNewsNoticeLikeAll(String title);
	// 根据id查询推送资讯详情
	NewsNotice findNewsNoticeById(String n_no);
	
	
}
