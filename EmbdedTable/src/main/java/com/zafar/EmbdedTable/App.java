package com.zafar.EmbdedTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.Emplyee.Emplyee;
import com.zafar.StudentVO.StudentVo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Embded program" );
        Configuration configuration=new Configuration();
        configuration.configure("db.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
        //System.out.println(factory);
        StudentVo studentVo=new StudentVo();
        studentVo.setId(1);
        studentVo.setName("zafar imam");
        studentVo.setCity("New Delhi");
        Emplyee emplyee=new Emplyee();
        emplyee.seteName("rehan khan");
        emplyee.setDep("java devloper");
        studentVo.setEmplyee(emplyee);
        Session session = factory.openSession();
        session.save(studentVo);
        Transaction transaction = session.beginTransaction();
        
        transaction.commit();
        session.close();
        factory.close();
        
        		
    }
}
