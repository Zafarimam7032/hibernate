package com.zafar.HibernateGetAndLoad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.dbopration.DbOperation;
import com.zafar.studentvo.StudentVo;


public class App 
{
	Configuration configuration;
	SessionFactory factory;
	public SessionFactory conguration()
	{
		Configuration configuration=new Configuration();
	    configuration.configure("dbcon.cfg.xml");
	    SessionFactory factory=configuration.buildSessionFactory();
	     return factory;
		
	}
    public static void main( String[] args )
    {
       
     App app=new App();
  SessionFactory factory=app.conguration();
   
     DbOperation dbOperation=new DbOperation();
      StudentVo studentVo2 = dbOperation.insert();
      
      System.out.println(studentVo2);
      Session session=factory.openSession();
      session.save(studentVo2);
     // dbOperation.select(session);
      Transaction transaction = session.beginTransaction();
      
      transaction.commit();
      session.close();
      factory.close();
      
      
    
       
    }
}
