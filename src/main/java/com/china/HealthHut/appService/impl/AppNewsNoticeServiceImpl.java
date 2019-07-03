package com.china.HealthHut.appService.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.china.HealthHut.appService.AppNewsNoticeService;
import com.china.HealthHut.appmapper.AppNewsNoticeMapper;
import com.china.HealthHut.pojo.NewsNotice;

@Service
public class AppNewsNoticeServiceImpl implements AppNewsNoticeService{
	
	@Autowired
	private AppNewsNoticeMapper appNewsNoticeMapper;
	 
	@Override
	public List<NewsNotice> findNewsNoticeAll() {
		return this.appNewsNoticeMapper.findNewsNoticeAll();
	}

	@Override
	public List<NewsNotice> findNewsNoticeLikeAll(String title) {
		
		return this.appNewsNoticeMapper.findNewsNoticeLikeAll(title);
	}

	@Override
	public NewsNotice findNewsNoticeById(String n_no) {
		return this.appNewsNoticeMapper.findNewsNoticeById(n_no);
	}

	
}
