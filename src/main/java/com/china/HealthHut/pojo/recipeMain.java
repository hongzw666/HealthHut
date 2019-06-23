package com.china.HealthHut.pojo;

import java.util.Date;

public class recipeMain {
	// 自增id
	private int rm_id;
	
	// 门诊号——与挂号的门诊号对应
	private String rm_reg_no;

	// 学号/工号
	private String patient_no;

	// 姓名
	private String name;

	// 身份证号
	private String id_no;

	// 医师
	private String physician;

	// 结算方式——现金、校园卡
	private String pay_type;

	// 病人类型——自费、广州医保
	private String patient_type;

	// 总金额
	private double total_amount;

	// 自费金额
	private double self_amount1;

	// 自付金额
	private double self_amount2;

	// 记账金额——报销金额
	private double reimburse_amount;

	// 药品金额
	private double drug_amount;

	// 挂号费
	private double reg_amount;

	// 检查费
	private double check_amount;

	// 治疗费
	private double treat_amount;

	// 四舍五入
	private double round;

	// 收费员
	private String cashier;

	// 收费时间
	private Date pay_time;

	// 临床诊断——诊断结果，可以选择，也可以手工录入
	private String diagnose;

	// 是否已收费——两种状态：已收费、未付费
	private String charged;

	public int getRm_id() {
		return rm_id;
	}

	public void setRm_id(int rm_id) {
		this.rm_id = rm_id;
	}

	public String getRm_reg_no() {
		return rm_reg_no;
	}

	public void setRm_reg_no(String rm_reg_no) {
		this.rm_reg_no = rm_reg_no;
	}

	public String getPatient_no() {
		return patient_no;
	}

	public void setPatient_no(String patient_no) {
		this.patient_no = patient_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getPhysician() {
		return physician;
	}

	public void setPhysician(String physician) {
		this.physician = physician;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public String getPatient_type() {
		return patient_type;
	}

	public void setPatient_type(String patient_type) {
		this.patient_type = patient_type;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public double getSelf_amount1() {
		return self_amount1;
	}

	public void setSelf_amount1(double self_amount1) {
		this.self_amount1 = self_amount1;
	}

	public double getSelf_amount2() {
		return self_amount2;
	}

	public void setSelf_amount2(double self_amount2) {
		this.self_amount2 = self_amount2;
	}

	public double getReimburse_amount() {
		return reimburse_amount;
	}

	public void setReimburse_amount(double reimburse_amount) {
		this.reimburse_amount = reimburse_amount;
	}

	public double getDrug_amount() {
		return drug_amount;
	}

	public void setDrug_amount(double drug_amount) {
		this.drug_amount = drug_amount;
	}

	public double getReg_amount() {
		return reg_amount;
	}

	public void setReg_amount(double reg_amount) {
		this.reg_amount = reg_amount;
	}

	public double getCheck_amount() {
		return check_amount;
	}

	public void setCheck_amount(double check_amount) {
		this.check_amount = check_amount;
	}

	public double getTreat_amount() {
		return treat_amount;
	}

	public void setTreat_amount(double treat_amount) {
		this.treat_amount = treat_amount;
	}

	public double getRound() {
		return round;
	}

	public void setRound(double round) {
		this.round = round;
	}

	public String getCashier() {
		return cashier;
	}

	public void setCashier(String cashier) {
		this.cashier = cashier;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getCharged() {
		return charged;
	}

	public void setCharged(String charged) {
		this.charged = charged;
	}

}
