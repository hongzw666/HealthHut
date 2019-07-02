package com.china.HealthHut.pojo;

import java.sql.Date;

public class HeathInsurance {

	// 自增id值
	private int hi_id;

	// 学号——唯一索引
	private String st_number;

	// 姓名
	private String name;

	// 医保卡号
	private String card_no;

	// 身份证号码
	private String id_no;

	// 联系电话
	private String telephone;

	// 参保开始日期
	private Date start_date;

	// 参保截止日期
	private Date end_date;

	// 状态——正常或者作废
	private String hi_status;

	public int getHi_id() {
		return hi_id;
	}

	public void setHi_id(int hi_id) {
		this.hi_id = hi_id;
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

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getHi_status() {
		return hi_status;
	}

	public void setHi_status(String hi_status) {
		this.hi_status = hi_status;
	}

	@Override
	public String toString() {
		return "HeathInsurance [hi_id=" + hi_id + ", st_number=" + st_number + ", name=" + name + ", card_no=" + card_no
				+ ", id_no=" + id_no + ", telephone=" + telephone + ", start_date=" + start_date + ", end_date="
				+ end_date + ", hi_status=" + hi_status + "]";
	}

	public HeathInsurance(String st_number, String name, String card_no, String id_no, String telephone,
			Date start_date, Date end_date) {
		this.st_number = st_number;
		this.name = name;
		this.card_no = card_no;
		this.id_no = id_no;
		this.telephone = telephone;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public HeathInsurance() {
	}

}
