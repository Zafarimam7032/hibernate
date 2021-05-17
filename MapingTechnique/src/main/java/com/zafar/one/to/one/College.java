package com.zafar.one.to.one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="College_DetailsZ")
public class College {
	@Id
	@Column(name="Student_id",length = 15)
	private int id;
	@Column(name="Hallticket",length = 15)
	private String hallticket;
	@Column(name = "Course")
	private String course;
	
	@OneToOne()
	private StudentVo studentVo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHallticket() {
		return hallticket;
	}
	public void setHallticket(String hallticket) {
		this.hallticket = hallticket;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public StudentVo getStudentVo() {
		return studentVo;
	}
	public void setStudentVo(StudentVo studentVo) {
		this.studentVo = studentVo;
	}
	

}
