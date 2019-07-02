package com.china.HealthHut.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppWorkersService;
import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.WorkersService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/HealthHut/App")
public class AppWorkersController {
	
	@Autowired
	private AppWorkersService appWorkersService;

	
	//查询所有医生
	@RequestMapping("/findWorkersAll")
	@ResponseBody
	public String findWorkersAll(String callback){
		List<Workers> workersList = this.appWorkersService.findWorkersAll();
		if (workersList.size() > 0) {
			String workersjson = new Gson().toJson(workersList);
			return callback+"("+workersjson+")";
		}
		return callback+"({\"status\":\"fail\"})";
	}
	
	//根据ID查询医生详情
		@RequestMapping("/getWorkersById")
		@ResponseBody
		public String workersgetWorkersById(String callback, String workers_id) {
			Workers worker = this.appWorkersService.getWorkersById(workers_id);
			if (worker != null) {
				String workersjson = new Gson().toJson(worker);
				return callback+"("+workersjson+")";
			}
			return callback+"({\"status\":\"fail\"})";
		}
	
}
