package com.zafar.EgarAndLazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.employee.company.Company;
import com.zafar.employee.pojo.EmplVO;

public class App {
	public static void main(String[] args) {
		System.out.println("LazyAndEgar");
		SessionFactory sessionFactory = new Configuration().configure("dbcon.cfg.xml").buildSessionFactory();
		
		// System.out.println(session);
		EmplVO emplVO = new EmplVO();
		emplVO.setEmpid(1);
		emplVO.setEmpName("Zafar imam");
		emplVO.setDeparment("java Devloper");
		Company conCompany = new Company();
		conCompany.setComid(2);
		conCompany.setCompanyName("GraetWits");
		conCompany.setSalary("19430");
		conCompany.setEmplVO(emplVO);
		emplVO.setCompanyName(conCompany);
		Session session = sessionFactory.openSession();
		session.save(emplVO);
		session.save(conCompany);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.clear();
		session.close();
		sessionFactory.close();
		System.out.println("finished");

	}
}
