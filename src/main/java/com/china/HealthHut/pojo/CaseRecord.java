package com.china.HealthHut.pojo;

import java.sql.Date;

public class CaseRecord {
	// 自增id值
	private int case_id;
	// 学号或者工号
	private String s_t_number;
	// 姓名
	private String username;
	// 患者性别
	private String sex;
	// 诊断内容
	private String treatment;
	// 就诊日期
	private Date treatmentdt;

	public int getCase_id() {
		return case_id;
	}

	public void setCase_id(int case_id) {
		this.case_id = case_id;
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
