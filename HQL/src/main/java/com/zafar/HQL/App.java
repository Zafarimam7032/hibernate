package com.zafar.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.pojo.EmpVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inseart Operation" );
        Configuration configuration=new Configuration();
        configuration.configure("dbcon.cfg.xml");
        SessionFactory buildSessionFactory = configuration.buildSessionFactory();
        EmpVO empVO=new EmpVO();
        empVO.setId(1);
        empVO.setName("Zafar  imam");
        empVO.setCity("new Delhi");
        empVO.setMobileNumber("7032871006");
        empVO.setDepartment("java Devloper");
        Session session = buildSessionFactory.openSession();
        session.save(empVO);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.clear();
        session.close();
    }
}
