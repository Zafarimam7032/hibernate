package com.zafar.XmlBasedCreateTable;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.pojo.EmplyeeVO;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "main method" );
        Session session = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        EmplyeeVO emplyeeVO=new EmplyeeVO();
        emplyeeVO.setEmpid(1);
        emplyeeVO.setEpmName("Zafar imam");
        emplyeeVO.setAdddress("new Delhi");
        emplyeeVO.setDeparment("java devloper");
        emplyeeVO.setSalry(1989988d);
        session.save(emplyeeVO);
        transaction.commit();
        System.out.println("finished");
        
    }
}
