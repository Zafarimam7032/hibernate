package com.zafar.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employz")
public class EmpVO {
	@Id
	@Column(name ="Emp_id" ,length = 10)
	private int id;
	@Column(name = "Emp_Name",length = 40)
	private String name;
	@Column(name = "City",length = 30)
	private String city;
	@Column(name = "Deparment",length = 30)
	private String department;
	@Column(name = "Mobile_Number",length = 15)
	private String mobileNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

}
