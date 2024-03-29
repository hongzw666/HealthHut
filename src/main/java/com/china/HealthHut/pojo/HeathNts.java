package com.china.HealthHut.pojo;

import java.sql.Date;

public class HeathNts {

	// 自增id值
	private int hth_no;

	// 学号或者工号
	private String st_number;

	// 记录的标题
	private String title;

	// 记录的正文内容
	private String content;

	// 记录创建时间
	private Date record_date;

	public int getHth_no() {
		return hth_no;
	}

	public void setHth_no(int hth_no) {
		this.hth_no = hth_no;
	}

	public String getSt_number() {
		return st_number;
	}

	public void setSt_number(String st_number) {
		this.st_number = st_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRecord_date() {
		return record_date;
	}

	public void setRecord_date(Date record_date) {
		this.record_date = record_date;
	}

	@Override
	public String toString() {
		return "[hth_no:" + hth_no + ", st_number:" + st_number + ", title:" + title + ", content:" + content
				+ ", record_date:" + record_date + "]";
	}

}
