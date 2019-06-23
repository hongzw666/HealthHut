package com.china.HealthHut;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.china.HealthHut.pojo.Workers;
import com.china.HealthHut.service.WorkersService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkersServiceImplTest {
	@Autowired
	private WorkersService workersService;
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void findWorkersList() {
		List<Workers> findWorkersList = this.workersService.findWorkersList(2, 5);
		for (Workers workers : findWorkersList) {
			System.out.println(workers);
		}
	}
	//测根据id查询Workers
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
		int i = findWorkersAll.size() / 9;
		if (findWorkersAll.size() % 9 > 0) {
			i++;
		}
		System.out.println("长度是" + i);
	}

}
