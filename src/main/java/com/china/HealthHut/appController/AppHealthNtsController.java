package com.china.HealthHut.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppHealthNtsService;
import com.china.HealthHut.pojo.HeathNts;

@Controller
@RequestMapping("/HealthHut/App")
public class AppHealthNtsController {
	
	@Autowired
	private AppHealthNtsService appHealthNtsService;
	
	//添加健康记录
	@RequestMapping("/addHealthNts")
	@ResponseBody
	public String addHealthNts(String callback, HeathNts heathNts) {
		int count = this.appHealthNtsService.addHealthNts(heathNts);
		if (count >0) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
		
	//根据id删除
	@RequestMapping("/deleteHealthNts")
	@ResponseBody
	 public String deleteHealthNts(String callback, Integer id) {
		int count = this.appHealthNtsService.deleteHealthNts(id);
		if (count >0) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//根据学号或工号查找 
	@RequestMapping("/findHeathNtsId")
	@ResponseBody
	 public String findHeathNtsId(String callback, Integer id) {
		List<HeathNts> findHeathNtsId = this.appHealthNtsService.findHeathNtsId(id);
		if (findHeathNtsId !=null) {
			return callback+"("+findHeathNtsId+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	 //根据id修改 
	@RequestMapping("/updateHeathNts")
	@ResponseBody
	 public String updateHeathNts(String callback, HeathNts heathNts) {
		int count = this.appHealthNtsService.updateHeathNts(heathNts);
		if (count >0) {
			return callback+"({\"status\":\"success\"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
