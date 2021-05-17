package com.zafar.one.to.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student_DetailsZ")
public class StudentVo {
	@Id
	@Column(name = "Student_id",length = 15)
	private int id;
	@Column(name="Student_Name",length=20)
	private String name;
	@Column(name="Student_City",length=15)
	private String city;
	@OneToOne(mappedBy = "studentVo")
	@JoinColumn(name = "college_id")
	private College college;
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
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	

}
