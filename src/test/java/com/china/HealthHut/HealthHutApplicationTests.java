package com.china.HealthHut;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.china.HealthHut.appService.AppCaseRecordService;
import com.china.HealthHut.appService.AppHealthInsuranceService;
import com.china.HealthHut.appService.AppHealthNtsService;
import com.china.HealthHut.pojo.Admin;
import com.china.HealthHut.pojo.HeathInsurance;
import com.china.HealthHut.pojo.HeathNts;
import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.AdminLoginService;
import com.china.HealthHut.service.WorkersService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HealthHutApplicationTests {
	@Autowired
	private WorkersService workersService;
	@Autowired
	private AdminLoginService adminLoginService;
	@Autowired
	private AppHealthNtsService appHealthNtsService;
	@Autowired
	private AppCaseRecordService appCaseRecordService;
	@Autowired
	private AppHealthInsuranceService appHealthInsuranceService;
	
	@Test
	public void contextLoads() {
		
	}
	@Test
	public void findWorkersList() {
		List<Workers> findWorkersList = this.workersService.findWorkersList(2, 5);
		for (Workers workers : findWorkersList) {
			System.out.println(workers);
		}
	}
	@Test
	public void getWorkersById() {
		Workers workersById = this.workersService.getWorkersById("1");
		System.out.println(workersById);
	
	}
	//测试求总页数
	@Test
	public void findWorkersAll() {
		List<Workers> findWorkersAll = this.workersService.findWorkersAll();
		for (Workers workers : findWorkersAll) {
			System.out.println(workers);
		}
		int i = findWorkersAll.size()/9;
		if (findWorkersAll.size()%9>0) {
			i++;
		}
		System.out.println("长度是"+i);
	}
	
	@Test
	//测试管理员登录，验证账号密码
	public void findAdmin() {
		Admin admin = this.adminLoginService.findAdmin("1", "1");
		System.out.println(admin);
	
	}
	@Test
	//测试健康管理查询
	public void findHeathNtsId() {
		HeathNts heathNts2 = new HeathNts();
		heathNts2.setSt_number("01");
		List<HeathNts> findHeathNtsId = this.appHealthNtsService.findHeathNtsId(heathNts2);
		for (HeathNts heathNts : findHeathNtsId) {
			System.out.println(heathNts);
		}
	}
	@Test
	//测试病历详情
	public void findCaseRecordById() {
		HeathNts heathNts2 = new HeathNts();
		heathNts2.setSt_number("01");
		List<HeathNts> findHeathNtsId = this.appHealthNtsService.findHeathNtsId(heathNts2);
		for (HeathNts heathNts : findHeathNtsId) {
			System.out.println(heathNts);
		}
	}
	@Test
	//添加医保信息
	public void addInById() {
		Date date = new Date();
		date.getDate();
		date.getDay();
		
		
	}
}
