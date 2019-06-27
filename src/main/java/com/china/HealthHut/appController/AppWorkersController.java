package com.china.HealthHut.appController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.china.HealthHut.appService.AppWorkersService;
import com.china.HealthHut.pojo.Workers;

@Controller
@RequestMapping("/HealthHut/App")
public class AppWorkersController {
	
	@Autowired
	private AppWorkersService appWorkersService;
	@RequestMapping("/findWorkersAll")
	@ResponseBody
	public String findWorkersAll(String callback){
		List<Workers> WorkersList = this.appWorkersService.findWorkersAll();
		if (WorkersList != null) {
			return callback+"({"+WorkersList+"})";
		}
		return callback+"({\"status\":\"fail\"})";
	}
}
