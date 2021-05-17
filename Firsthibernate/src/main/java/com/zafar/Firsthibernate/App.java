package com.zafar.Firsthibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.NormalVo.NormalVo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "hibernate example" );
        Configuration configuration=new Configuration();
        configuration.configure("database.cfg.xml");
    SessionFactory sessionFactory=configuration.buildSessionFactory();
   NormalVo normalVo=new NormalVo();
   normalVo.setId(4);
   normalVo.setSname("zafar Imama");
   normalVo.setMobile("7032871006");
   normalVo.setCity("new Delhi");
    System.out.println(normalVo);
    Session session = sessionFactory.openSession();
    session.save(normalVo);
    Transaction transaction = session.beginTransaction();
    transaction.commit();
    
    }
}
