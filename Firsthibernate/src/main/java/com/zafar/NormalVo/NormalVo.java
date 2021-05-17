package com.zafar.NormalVo;

import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "NormalZafar")
public class NormalVo {
	@Id
	private int id;
	private String Sname;
	private String city;
	private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "NormalVo [id=" + id + ", Sname=" + Sname + ", city=" + city + ", mobile=" + mobile + "]";
	}

}
