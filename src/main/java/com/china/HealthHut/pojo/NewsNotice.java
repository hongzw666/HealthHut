package com.china.HealthHut.pojo;

import java.sql.Date;

public class NewsNotice {

	// 自增id值
	private int n_no;

	// 咨询推送标题
	private String title;

	// 咨询推送的文章内容
	private String content;

	// 创建推送时间
	private Date time_stamp;
	
	//图片路径
	private String src;
	
	public int getN_no() {
		return n_no;
	}

	public void setN_no(int n_no) {
		this.n_no = n_no;
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

	public Date getTime_stamp() {
		return time_stamp;
	}

	public void setTime_stamp(Date time_stamp) {
		this.time_stamp = time_stamp;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

}
