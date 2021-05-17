package com.zafar.studentvo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StudentDetailsZafar")
public class StudentVo {
	@Id
	private int id;
	@Column(name = "Student_name", length = 40)
	private String sname;
	@Column(name = "City", length = 40)
	private String city;
	@Column(name = "Mobile_Number", length = 15)
	private String mobile;
	@Column(name = "Deparment", length = 30)
	private String department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", sname=" + sname + ", city=" + city + ", mobile=" + mobile + ", department="
				+ department + "]";
	}

}
