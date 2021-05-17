package com.zafar.MapingTechnique;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.one.to.one.College;
import com.zafar.one.to.one.StudentVo;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Mapping technique" );
        Configuration configuration=new Configuration();
        configuration.configure("dbcon.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        //System.out.println(factory);
        StudentVo studentVo=new StudentVo();
        studentVo.setId(4);
        studentVo.setName("Zafar imam");
        studentVo.setCity("New Delhi");
        College college=new College();
        college.setId(4);
        college.setHallticket("232131");
        college.setCourse("Software Engineering ");
        college.setStudentVo(studentVo);
        studentVo.setCollege(college);
        Session session = factory.openSession();
        session.save(studentVo);
        session.save(college);
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        System.out.println("finished");
        session.clear();
        session.clear();
        factory.close();
        
        
    }
}
