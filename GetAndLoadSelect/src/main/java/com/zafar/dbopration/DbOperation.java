package com.zafar.dbopration;

import org.hibernate.Session;

import com.zafar.studentvo.StudentVo;

public class DbOperation {
	public StudentVo insert()
	{
		StudentVo studentVo =new StudentVo();
		studentVo.setId(2);
		studentVo.setSname("rehan khan");
		studentVo.setCity("delhi");
		studentVo.setMobile("7032872006");
		studentVo.setDepartment("java ");
		return studentVo;
		
	}
	public void select( Session session)
	{
		StudentVo studentVo = session.get(StudentVo.class, 3);
		System.out.println(studentVo);
		
	}

}
