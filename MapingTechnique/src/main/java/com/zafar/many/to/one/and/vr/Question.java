package com.zafar.many.to.one.and.vr;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name = "QuestionZ")
public class Question {
	@Id
	@Column(name = "Question_id",length = 10)
	private int qid;
	@Column(name = "Question_name")
	private String qust;
	@ManyToAny(metaColumn = @Column(name = "Answer_id"))
	private List<Answer> answers;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQust() {
		return qust;
	}
	public void setQust(String qust) {
		this.qust = qust;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	

}
