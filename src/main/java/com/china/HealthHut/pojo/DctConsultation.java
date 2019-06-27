package com.china.HealthHut.pojo;

import java.sql.Date;
import java.sql.Timestamp;

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
	private Timestamp time_stamp;

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

	

	public DctConsultation( String uid, String fid, String content_record, Timestamp time_stamp) {
		this.uid = uid;
		this.fid = fid;
		this.content_record = content_record;
		this.time_stamp = time_stamp;
	}

	public DctConsultation() {
	}

	public Timestamp getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Timestamp time_stamp) {
		this.time_stamp = time_stamp;
	}

	@Override
	public String toString() {
		return "DctConsultation [dtr=" + dtr + ", uid=" + uid + ", fid=" + fid + ", content_record=" + content_record
				+ ", time_stamp=" + time_stamp + "]";
	}
	
}
