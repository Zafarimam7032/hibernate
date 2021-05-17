package com.zafar.CachedInHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zafar.pojo.StudentVOCached;

public class SecondLevelCached {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("dbcon.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		StudentVOCached cached = session.get(StudentVOCached.class, 1);
		System.out.println(cached);
		session.clear();
		session.close();
		Session session2=sessionFactory.openSession();
		
		StudentVOCached sCached=session2.get(StudentVOCached.class, 1);
		System.out.println(sCached);
		session2.clear();
		session2.close();
		sessionFactory.close();
	}

}
