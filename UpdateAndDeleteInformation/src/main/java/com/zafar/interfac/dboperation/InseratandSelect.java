package com.zafar.interfac.dboperation;

import java.util.Scanner;

import org.hibernate.SessionFactory;

public interface InseratandSelect {
	public void insert(SessionFactory factory,Scanner scanner);
	public void selectid(SessionFactory factory,Scanner scanner);
	public void selectAll(SessionFactory sessionFactory);

}
