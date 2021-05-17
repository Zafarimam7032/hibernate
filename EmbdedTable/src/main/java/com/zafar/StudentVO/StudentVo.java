package com.zafar.StudentVO;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.zafar.Emplyee.Emplyee;
@Entity
@Table(name = "CollegeZafar")
public class StudentVo {
	@Id
	private int  id;
	@Column(name="StudentName",length = 30)
	private String name;
	@Column(name="City" ,length = 20)
	private String city;
	@Embedded
	private Emplyee emplyee;
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
	public Emplyee getEmplyee() {
		return emplyee;
	}
	public void setEmplyee(Emplyee emplyee) {
		this.emplyee = emplyee;
	}
	
	

}
