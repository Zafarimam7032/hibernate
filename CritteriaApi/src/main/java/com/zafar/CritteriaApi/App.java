package com.zafar.CritteriaApi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.zafar.pojo.EmpVO;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Strated" );
        Session session = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory().openSession();
        App app=new App();
        app.normalDisplay(session);
        app.criteriaApi();
        System.out.println( "Finished" );
    }
    public void normalDisplay(Session session)
    {
    	String sql="from EmpVO";
    	Query<EmpVO> query=session.createQuery(sql);
    	List<EmpVO> list = query.list();
    	for(EmpVO empVO:list)
    	{
    		System.out.println("============================================");
    		System.out.println(empVO.getId());
    		System.out.println(empVO.getName());
    		System.out.println(empVO.getCity());
    		System.out.println(empVO.getDepartment());
    		System.out.println(empVO.getMobileNumber());
    	}
    }
    public void criteriaApi()
    {
    	System.out.println("===================Api======================");
    Configuration configuration=new Configuration();
    configuration.configure("dbcon.cfg.xml");
    SessionFactory factory = configuration.buildSessionFactory();
    Session session = factory.openSession();
    Criteria criteria=session.createCriteria(EmpVO.class);
   criteria.add(Restrictions.gt("id", 5));
   List list = criteria.list();
   for(Object objects: list)
   {
	   EmpVO empVO=(EmpVO) objects;
	   System.out.println("============================================");
		System.out.println(empVO.getId());
		System.out.println(empVO.getName());
		System.out.println(empVO.getCity());
		System.out.println(empVO.getDepartment());
		System.out.println(empVO.getMobileNumber());
   }
    }
}
