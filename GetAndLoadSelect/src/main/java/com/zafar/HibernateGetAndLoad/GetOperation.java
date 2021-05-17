package com.zafar.HibernateGetAndLoad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zafar.dbopration.DbOperation;

public class GetOperation {
	public static  void main (String [] args)
	{
		App app=new App();
		SessionFactory factory=app.conguration();
		Session session = factory.openSession();
		DbOperation dbOperation=new DbOperation();
		dbOperation.select(session);
		
		
	}

}
