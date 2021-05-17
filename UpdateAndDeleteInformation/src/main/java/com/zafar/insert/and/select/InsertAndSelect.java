package com.zafar.insert.and.select;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zafar.interfac.dboperation.InseratandSelect;
import com.zafar.pojo.DataInsertAndDisplay;
import com.zafar.pojo.StudentDataZafar;

public class InsertAndSelect implements InseratandSelect{

	public void insert(SessionFactory factory,Scanner scanner) {
		// TODO Auto-generated method stub
		DataInsertAndDisplay dataInsertInPojo=new DataInsertAndDisplay();
		StudentDataZafar stuZafar=dataInsertInPojo.dataAdd(scanner);
		Session session=factory.openSession();
		session.save(stuZafar);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.clear();
		session.close();
	
		
	}

	public void selectid(SessionFactory factory,Scanner scanner) {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		DataInsertAndDisplay dataInsertAndDisplay=new DataInsertAndDisplay();
		int id =dataInsertAndDisplay.insertid(scanner);
		
		StudentDataZafar dataZafar = session.load(StudentDataZafar.class,id );
		dataInsertAndDisplay.display(dataZafar);
		session.clear();
		session.close();
	
		
		
	}

	public void selectAll(SessionFactory sessionFactory) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		String sql="from StudentDataZafar";
		Query<StudentDataZafar> query=session.createQuery(sql);
		List<StudentDataZafar> list = query.list();
		Iterator<StudentDataZafar> iterator=list.iterator();
		 DataInsertAndDisplay dataInsertAndDisplay =new DataInsertAndDisplay();
		 while(iterator.hasNext())
		 {
			 StudentDataZafar studentDataZafar=iterator.next();
			dataInsertAndDisplay.display(studentDataZafar);
			 
		 }
		 session.clear();
		 session.close();
		
	}

	

	
	
}
