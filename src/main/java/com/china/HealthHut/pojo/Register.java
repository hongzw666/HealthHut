package com.china.HealthHut.pojo;

import java.sql.Date;

public class Register {

	// 暂时是自增id值
	private int reg_no;

	// 发病时间
	private Date disease_time;

	// 病症状类型---由手工录入症 状
	private String symptom_type;

	// 就诊日期
	private Date see_date;

	// 身份证号码
	private String id_no;

	// 学号/工号
	private String st_number;

	// 姓名
	private String name;

	// 年龄
	private String age;

	// 性别
	private String sex;

	// 联系电话
	private String telephone;

	// 是否为学生
	private String isstudent;

	// 初诊/复诊
	private String first_further;

	// 挂号费
	private double register_fee;

	public int getReg_no() {
		return reg_no;
	}

	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}

	public Date getDisease_time() {
		return disease_time;
	}

	public void setDisease_time(Date disease_time) {
		this.disease_time = disease_time;
	}

	public String getSymptom_type() {
		return symptom_type;
	}

	public void setSymptom_type(String symptom_type) {
		this.symptom_type = symptom_type;
	}

	public Date getSee_date() {
		return see_date;
	}

	public void setSee_date(Date see_date) {
		this.see_date = see_date;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getSt_number() {
		return st_number;
	}

	public void setSt_number(String st_number) {
		this.st_number = st_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIsstudent() {
		return isstudent;
	}

	public void setIsstudent(String isstudent) {
		this.isstudent = isstudent;
	}

	public String getFirst_further() {
		return first_further;
	}

	public void setFirst_further(String first_further) {
		this.first_further = first_further;
	}

	public double getRegister_fee() {
		return register_fee;
	}

	public void setRegister_fee(double register_fee) {
		this.register_fee = register_fee;
	}

}
