package com.china.HealthHut.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.WorkersService;


@Controller
@RequestMapping("/HealthHut")
public class WorkersController {

	@Autowired
	private WorkersService workersService;
	
	//workers管理页面
	@RequestMapping("/toWorkers")
	public String toWorkers(Model model) {
		List<Workers> workersAll = this.workersService.findWorkersAll();
		int yeshu = workersAll.size()/9;
		if (workersAll.size()%9>0) {
			yeshu++;
		}
		model.addAttribute("yeshu", yeshu);
		return "workers";
	}
	
	//分页查询workers
	@RequestMapping("/workersList")
	@ResponseBody
	public List<Workers> workersList(int page) {
		List<Workers> workersList =  this.workersService.findWorkersList(page*9,9);
		return workersList;
	}
	//根据id查询workers
	@RequestMapping("/getWorkersById")
	@ResponseBody
	public Workers workersgetWorkersById(String id) {
		Workers worker = null;
		if (id != null) {
			worker = this.workersService.getWorkersById(id);
		}
		return worker;
	}
	
	//更新workers
	@RequestMapping("/update")
	@ResponseBody
	public String workersUpdate( Workers worker) {
		int count = this.workersService.update(worker);
		if (count>0) {
			return "OK";
		}
		return "";
	}
	
	//删除workers
	@RequestMapping("/delete")
	@ResponseBody
	public String deleteWorkers(String id) {
		int count = this.workersService.deleteWorkers(id);
		if (count>0) {
			return "OK";
		}
		return "";
	}
	
	//创建workers
	@RequestMapping("/create")
	@ResponseBody
	public String createWorkers(Workers workers) {
		System.out.println(workers.getWork_date());
		int count = 0;
		try {
			count = this.workersService.createWorkers(workers);
		} catch (Exception e) {
			return "";
		}
		if (count>0) {
			return "OK";
		}
		return "";
	}
}
