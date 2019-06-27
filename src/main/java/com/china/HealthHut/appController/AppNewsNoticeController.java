package com.china.HealthHut.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.china.HealthHut.appService.AppNewsNoticeService;
import com.china.HealthHut.appService.AppRegisterService;
import com.china.HealthHut.pojo.NewsNotice;
import com.china.HealthHut.pojo.Register;

@Controller
@RequestMapping("/HealthHut/App")
public class AppNewsNoticeController {
	
	@Autowired
	private AppNewsNoticeService appNewsNoticeService;
	
	//查询所有推送资讯
	@RequestMapping("/findRegisterAll")
	public String findRegisterAll(String callback) {
		List<NewsNotice> TegisterList = this.appNewsNoticeService.findNewsNoticeAll();
		if (TegisterList !=null) {
			return callback+"("+TegisterList+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//根据标题（title） 模糊查询推送资讯
	@RequestMapping("/findNewsNoticeLikeAll")
	public String findNewsNoticeLikeAll(String callback ,String title) {
		List<NewsNotice> TegisterList = this.appNewsNoticeService.findNewsNoticeLikeAll(title);
		if (TegisterList !=null) {
			return callback+"("+TegisterList+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
