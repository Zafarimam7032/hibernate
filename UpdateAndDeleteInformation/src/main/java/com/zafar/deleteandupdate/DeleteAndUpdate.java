package com.zafar.deleteandupdate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zafar.interfac.dboperation.DeleteandUpdate;
import com.zafar.pojo.DataInsertAndDisplay;
import com.zafar.pojo.StudentDataZafar;

public class DeleteAndUpdate implements DeleteandUpdate {   
	public void update(SessionFactory sessionFactory ,Scanner scanner) {
		Session session = sessionFactory.openSession();
		DataInsertAndDisplay dataInsertAndDisplay=new DataInsertAndDisplay();
		int insertid = dataInsertAndDisplay.insertid(scanner);
		System.out.println("Enter Name:");
		String name=scanner.nextLine();
		//session.update(StudentDataZafar.class);
		String sql = "update StudentDataZafar set Name='"+name+"' where sno="+insertid;
		Query<?> query = session.createQuery(sql);
		int update = query.executeUpdate();
		System.out.println("data is update for user:" + update);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.clear();
		session.close();
	}

	public void deleteid(SessionFactory factory,Scanner scanner) {
		DataInsertAndDisplay dataInsertAndDisplay=new DataInsertAndDisplay();
		int insertid = dataInsertAndDisplay.insertid(scanner);
		StudentDataZafar studentDataZafar=new StudentDataZafar();
		studentDataZafar.setSid(insertid);
		Session openSession = factory.openSession();
		openSession.delete(studentDataZafar);
		System.out.println("data is delete for userId:"+insertid);
		openSession.clear();
		openSession.close();
		
		
	}

	public void deleteall(SessionFactory factory, Scanner scanner) {
		Session session=factory.openSession();
	
		
	}
}
