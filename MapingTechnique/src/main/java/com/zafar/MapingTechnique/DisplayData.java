package com.zafar.MapingTechnique;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sun.tools.javac.resources.compiler;
import com.zafar.many.to.many.City;
import com.zafar.many.to.many.Village;
import com.zafar.many.to.one.and.vr.Answer;
import com.zafar.many.to.one.and.vr.Question;

public class DisplayData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("dbcon.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Question question = session.get(Question.class, 1);
		String qust = question.getQust();
		System.out.println("=======one to many=====");
		System.out.println(qust);
		List<Answer> answers = question.getAnswers();
		Iterator<Answer> iterator = answers.iterator();
		while (iterator.hasNext()) {
			Answer answer = iterator.next();
			System.out.println(answer.getAnswer());
		}
		System.out.println("=================many  to many ==================");
		Village village = session.get(Village.class, 3);
		System.out.println(village.getVillname());
		List<City> list = village.getCities();
		Iterator<City> iterator2=list.iterator();
		while(iterator2.hasNext())
		{
			City city=iterator2.next();
			System.out.println(city.getName());
		}

	}

}
