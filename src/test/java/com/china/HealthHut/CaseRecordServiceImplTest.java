package com.china.HealthHut;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.china.HealthHut.pojo.CaseRecord;
import com.china.HealthHut.service.CaseRecordService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaseRecordServiceImplTest {
	@Autowired
	private CaseRecordService caseRecordService;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	//测试查询CaseRecordList
	public void findCaseRecordList() {
		List<CaseRecord> findCaseRecordList = this.caseRecordService.findCaseRecordList(1,1);
		for (CaseRecord caseRecord : findCaseRecordList) {
			System.out.println(caseRecord);
		}
		
	}
	
	@Test
	//测试根据ID查询CaseRecord
	public void findCaseRecordById() {
		CaseRecord CaseRecord = this.caseRecordService.findCaseRecordById(2);
			System.out.println(CaseRecord);
		
	}
	
	@Test
	//测试根据ID删除CaseRecord
	public void deleteCaseRecordById() {
		int count = this.caseRecordService.deleteCaseRecord(2);
			System.out.println(count);
	}
}
