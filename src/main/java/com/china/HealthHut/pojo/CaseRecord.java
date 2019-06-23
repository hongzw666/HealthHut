package com.china.HealthHut.pojo;

import java.sql.Date;

public class CaseRecord {
	// 学号或者工号
	private String s_t_number;
	// 姓名
	private String username;
	// 诊断内容
	private String treatment;
	// 就诊日期
	private Date treatmentdt;

	public String getS_t_number() {
		return s_t_number;
	}

	public void setS_t_number(String s_t_number) {
		this.s_t_number = s_t_number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public Date getTreatmentdt() {
		return treatmentdt;
	}

	public void setTreatmentdt(Date treatmentdt) {
		this.treatmentdt = treatmentdt;
	}

}
