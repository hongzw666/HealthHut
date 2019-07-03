package com.china.HealthHut.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppNewsNoticeService;
import com.china.HealthHut.appService.AppRegisterService;
import com.china.HealthHut.pojo.NewsNotice;
import com.china.HealthHut.pojo.Register;
import com.google.gson.Gson;

@Controller
@RequestMapping("/HealthHut/App")
public class AppNewsNoticeController {
	
	@Autowired
	private AppNewsNoticeService appNewsNoticeService;
	
	//查询所有推送资讯
	@RequestMapping("/findRegisterAll")
	@ResponseBody
	public String findRegisterAll(String callback) {
		List<NewsNotice> newsNoticeList = this.appNewsNoticeService.findNewsNoticeAll();
		if (newsNoticeList.size()>0) {
			String newsNoticeListJson = new Gson().toJson(newsNoticeList);
			return callback+"("+newsNoticeListJson+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//根据标题（title） 模糊查询推送资讯
	@RequestMapping("/findNewsNoticeLikeAll")
	@ResponseBody
	public String findNewsNoticeLikeAll(String callback ,String title) {
		List<NewsNotice> newsNoticeList = this.appNewsNoticeService.findNewsNoticeLikeAll(title);
		if (newsNoticeList.size() > 0) {
			String newsNoticejson = new Gson().toJson(newsNoticeList);
			return callback+"("+newsNoticejson+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	// 根据id查询推送资讯详情
	@RequestMapping("/findNewsNoticeById")
	@ResponseBody
	public String findNewsNoticeById(String callback ,String n_no) {
		NewsNotice newsNotice = this.appNewsNoticeService.findNewsNoticeById(n_no);
		if (newsNotice !=null) {
			String json = new Gson().toJson(newsNotice);
			return callback+"("+json+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
