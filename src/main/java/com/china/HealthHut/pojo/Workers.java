package com.china.HealthHut.pojo;

import java.sql.Date;

public class Workers {
	private String workers_id;
	private String name;
	private String sex;
	private Date birth;	
	private String position;	
	private String title;	
	private Date work_date;	
	private String telephone;	
	private Date dimission_date;
	
	
	public String getWorkers_id() {
		return workers_id;
	}
	public void setWorkers_id(String workers_id) {
		this.workers_id = workers_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getWork_date() {
		return work_date;
	}
	public void setWork_date(Date work_date) {
		this.work_date = work_date;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getDimission_date() {
		return dimission_date;
	}
	public void setDimission_date(Date dimission_date) {
		this.dimission_date = dimission_date;
	}
	@Override
	public String toString() {
		return "Workers [workers_id=" + workers_id + ", name=" + name + ", sex=" + sex + ", birth=" + birth
				+ ", position=" + position + ", title=" + title + ", work_date=" + work_date + ", telephone="
				+ telephone + ", dimission_date=" + dimission_date + "]";
	}
	
	
}
