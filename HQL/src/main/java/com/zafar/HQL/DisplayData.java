package com.zafar.HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zafar.pojo.EmpVO;

public class DisplayData {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
        configuration.configure("dbcon.cfg.xml");
        SessionFactory buildSessionFactory = configuration.buildSessionFactory();
        DisplayData data=new DisplayData();
        //data.displayAll(buildSessionFactory);
       // data.displayById(buildSessionFactory);
       // data.updateid(buildSessionFactory);
       // data.delete(buildSessionFactory);
        data.pagingSelect(buildSessionFactory);
	}
	public void displayAll(SessionFactory buildSessionFactory)
	{
        Session openSession = buildSessionFactory.openSession();
        String sql="from EmpVO";
        Query<EmpVO> query=openSession.createQuery(sql);
        List<EmpVO> list = query.getResultList();
        Iterator< EmpVO> iterator=list.iterator();
        while(iterator.hasNext())
        {
        	EmpVO vo = iterator.next();
        	System.out.println(vo.getId());
        	System.out.println(vo.getName());
        	System.out.println(vo.getCity());
        	System.out.println(vo.getDepartment());
        	System.out.println(vo.getMobileNumber());
        	
        }
        openSession.clear();
        openSession.close();
        
	}
	public  void displayById(SessionFactory factory)
	{
		Session session = factory.openSession();
		Query<EmpVO> query = session.createQuery("from EmpVO where id=:x");
		query.setParameter("x", 10);
		List<EmpVO> list = query.list();
	EmpVO vo=list.get(0);
	System.out.println(vo.getId());
	System.out.println(vo.getName());
	System.out.println(vo.getCity());
	System.out.println(vo.getDepartment());
	System.out.println(vo.getMobileNumber());
		
	}
	public void updateid(SessionFactory sessionFactory)
	{
		Session openSession = sessionFactory.openSession();
		Transaction transaction = openSession.beginTransaction();
		
		Query<EmpVO> query = openSession.createQuery("update EmpVO  set city=:c where id=:i");
		query.setParameter("c", "Hyderbad");
		query.setParameter("i", 1);
		
		int i = query.executeUpdate();
		transaction.commit();
		System.out.println("update for userid:"+i);
		
	}
	public void delete(SessionFactory sessionFactory)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String sql="delete EmpVO where id=:i";
		Query query = session.createQuery(sql);
		query.setParameter("i", 10);
		int update = query.executeUpdate();
		System.out.println("data is deleted for userId:"+update);
		System.out.println();
	}
public void pagingSelect(SessionFactory buildSessionFactory)
{
	 Session openSession = buildSessionFactory.openSession();
     String sql="from EmpVO";
     Query<EmpVO> query=openSession.createQuery(sql);
     query.setFirstResult(4);
     query.setMaxResults(3);
     List<EmpVO> list = query.getResultList();
    
     Iterator< EmpVO> iterator=list.iterator();
     while(iterator.hasNext())
     {
     	EmpVO vo = iterator.next();
     	System.out.println(vo.getId());
     	System.out.println(vo.getName());
     	System.out.println(vo.getCity());
     	System.out.println(vo.getDepartment());
     	System.out.println(vo.getMobileNumber());
     	
     }
     openSession.clear();
     openSession.close();
}
}
