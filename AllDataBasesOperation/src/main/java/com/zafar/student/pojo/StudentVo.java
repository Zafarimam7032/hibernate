package com.zafar.student.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="AlldataBaseOperationZ")
public class StudentVo {
	@Id
	@Column(name="Student_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="Student_Name",length = 100)
	private String name;
	@Column(name="City",length=100)
	private String city;
	@Column(name="Student_department",length = 100)
	private String department;
	@Column(name="Mobile_Number",length = 15)
	private String mobile;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
