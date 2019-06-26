package com.china.HealthHut.pojo;

import java.sql.Date;

public class DctConsultation {

	// 自增id值
	private int dtr;

	// 接收消息方——用户
	private String uid;

	// 发送消息方——用户
	private String fid;

	// 问诊记录内容
	private String content_record;

	// 问诊记录时间戳
	private Date time_stamp;

	public int getDtr() {
		return dtr;
	}

	public void setDtr(int dtr) {
		this.dtr = dtr;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}

	public String getContent_record() {
		return content_record;
	}

	public void setContent_record(String content_record) {
		this.content_record = content_record;
	}

	public Date getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Date time_stamp) {
		this.time_stamp = time_stamp;
	}

}
