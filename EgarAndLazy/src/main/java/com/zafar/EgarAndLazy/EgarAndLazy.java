package com.zafar.EgarAndLazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zafar.employee.company.Company;
import com.zafar.employee.pojo.EmplVO;

public class EgarAndLazy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("LazyAndEgar");
		SessionFactory sessionFactory = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	EmplVO emplVO = session.get(EmplVO.class, 1);
	Company company = emplVO.getCompanyName();
	System.out.println(emplVO.getEmpName());
	System.out.println(company.getSalary());
	System.out.println(emplVO.getClass());
	session.clear();
	session.close();
	
	
	}

}
