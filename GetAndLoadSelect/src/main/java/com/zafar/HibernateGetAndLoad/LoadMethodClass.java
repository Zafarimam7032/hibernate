package com.zafar.HibernateGetAndLoad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.zafar.studentvo.StudentVo;

public class LoadMethodClass {
	public static void main(String[] args) {
		App app=new App();
		SessionFactory factor=app.conguration();
		Session session=factor.openSession();
		StudentVo studentVo = session.load(StudentVo.class, 1);// load method is lazy initializer because when we need then its fired query 
		//System.out.println(studentVo);
		System.out.println(studentVo.getId()+" "+studentVo.getSname());
		System.out.println(studentVo.getId()+" "+studentVo.getCity()+" "+studentVo.getSname()+" "+studentVo.getMobile()+" "+studentVo.getDepartment());
		
		
	}

}
