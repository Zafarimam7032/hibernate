package com.zafar.CachedInHibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.zafar.pojo.StudentVOCached;

public class FiirstLevelCached {
	public static void main(String[] args) {
		Session session = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory().openSession();
		StudentVOCached cached = session.get(StudentVOCached.class, 1);
		System.out.println(cached);
		StudentVOCached studentVOCached = session.get(StudentVOCached.class, 1);
		System.out.println(studentVOCached);
		session.clear();
		session.close();
	}

}
