package com.zafar.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDataZafar {
	@Id
	@Column(name="student_id",length = 10)
	private int sid;
	@Column(name="student_Name",length = 30)
	private String name;
	@Column(name="student_City",length = 40)
	private String city;
	@Column(name="student_Email",length = 30)
	private String email;
	@Column(name="student_Number",length = 40)
	private String phoneNumber;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
