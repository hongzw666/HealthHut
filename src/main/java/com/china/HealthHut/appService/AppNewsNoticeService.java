package com.china.HealthHut.appService;

import java.util.List;
import com.china.HealthHut.pojo.NewsNotice;

public interface AppNewsNoticeService {
	//查询所有推送资讯
	List<NewsNotice> findNewsNoticeAll();

	//根据标题（title） 模糊查询推送资讯
	List<NewsNotice> findNewsNoticeLikeAll(String title);

	
	
}
