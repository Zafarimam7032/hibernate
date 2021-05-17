package com.zafar.CachedInHibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.pojo.StudentVOCached;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "inseartion Operation" );
        Session session = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        StudentVOCached studentVOCached=new StudentVOCached();
        studentVOCached.setId(1);
        studentVOCached.setName("Zafar imam");
        studentVOCached.setCity("New Delhi");
        studentVOCached.setMobileNumber("7032871006");
        studentVOCached.setSalry("2131242142");
        session.save(studentVOCached);
        transaction.commit();
        System.out.println( "inseartion Finished" );
    }
}
