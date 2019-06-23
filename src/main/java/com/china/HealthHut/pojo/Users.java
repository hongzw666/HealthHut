package com.china.HealthHut.pojo;

public class Users {
	// 自增id值
	private int userid;
	// 用户登录账户
	private String usercode;
	// 用户姓名
	private String username;
	// 用户登录密码
	private String password;
	// 联系电话
	private String telephone;
	// 是否为学生
	private String issutdent;
	// 学号或者教工号
	private String st_number;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getIssutdent() {
		return issutdent;
	}

	public void setIssutdent(String issutdent) {
		this.issutdent = issutdent;
	}

	public String getSt_number() {
		return st_number;
	}

	public void setSt_number(String st_number) {
		this.st_number = st_number;
	}

}
