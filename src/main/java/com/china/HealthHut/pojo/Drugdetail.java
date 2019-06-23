package com.china.HealthHut.pojo;

import java.sql.Date;

public class Drugdetail {
	// 自增id值
	private int dd_id;
	// 药品编号
	private String drug_no;
	// 药品名称
	private String name;
	// 药品规格
	private String unit;
	// 小单位
	private String min_unit;
	// 库存
	private double stock_num;
	// 有效期
	private Date effective_date;
	// 更新日期
	private Date update_date;
	// 操作员
	private String operator;

	public int getDd_id() {
		return dd_id;
	}

	public void setDd_id(int dd_id) {
		this.dd_id = dd_id;
	}

	public String getDrug_no() {
		return drug_no;
	}

	public void setDrug_no(String drug_no) {
		this.drug_no = drug_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getMin_unit() {
		return min_unit;
	}

	public void setMin_unit(String min_unit) {
		this.min_unit = min_unit;
	}

	public double getStock_num() {
		return stock_num;
	}

	public void setStock_num(double stock_num) {
		this.stock_num = stock_num;
	}

	public Date getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(Date effective_date) {
		this.effective_date = effective_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

}
