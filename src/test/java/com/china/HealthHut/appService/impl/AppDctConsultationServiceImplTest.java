package com.china.HealthHut.appService.impl;

import static org.junit.Assert.fail;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.china.HealthHut.appService.AppDctConsultationService;
import com.china.HealthHut.pojo.DctConsultation;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppDctConsultationServiceImplTest {
	@Autowired
	private AppDctConsultationService appDctConsultationService;
	@Test
	public void test() {
	}
	@Test
	public void test2() {
		for (int i = 0; i < 5; i++) {
			long currentTimeMillis = System.currentTimeMillis();
			Timestamp timestamp = new Timestamp(currentTimeMillis);
			DctConsultation dctConsultation = new DctConsultation("0"+i, "0"+i, i+"aa", timestamp);
			int count = this.appDctConsultationService.addDctConsultation(dctConsultation);	
		}
		
	}
	@Test
	public void test1() {
		
		List<DctConsultation> DctConsultationList = this.appDctConsultationService.findDctConsultationByUidAndFid("01", "02");	
		for (DctConsultation dctConsultation : DctConsultationList) {
			System.out.println(dctConsultation.toString()); 
		}
	}
}
