package com.zafar.MapingTechnique;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.many.to.one.and.vr.Answer;
import com.zafar.many.to.one.and.vr.Question;

public class ManytoOne {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("dbcon.cfg.xml");
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session session = buildSessionFactory.openSession();
		Question question=new Question();
		question.setQid(1);
		question.setQust("what is java");
		Answer answer=new Answer();
		answer.setAnsid(1);
		answer.setAnswer("java is programing language");
		Answer answer2=new Answer();
		answer2.setAnsid(2);
		answer2.setAnswer("java is platefporm  indepedent");
		List<Answer> lans=new ArrayList<Answer>();
		lans.add(answer);
		lans.add(answer2);
		question.setAnswers(lans);
		session.save(question);
		session.save(answer);
		session.save(answer2);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.clear();
		session.close();
		buildSessionFactory.close();
		
		
	}

}
