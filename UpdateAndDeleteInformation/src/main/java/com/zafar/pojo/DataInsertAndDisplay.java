package com.zafar.pojo;

import java.util.Scanner;

public class DataInsertAndDisplay {
	public StudentDataZafar dataAdd(Scanner scanner) {
		StudentDataZafar student = new StudentDataZafar();
		System.out.println("Enter Student_id:");
		student.setSid(scanner.nextInt());
		scanner.nextLine();
		System.out.println("enter Student_Name:");
		student.setName(scanner.nextLine());
		System.out.println("Enter City:");
		student.setCity(scanner.nextLine());
		System.out.println("Enter Your Mobile_Number:");
		student.setPhoneNumber(scanner.nextLine());
		System.out.println("Enter your Email:");
		student.setEmail(scanner.nextLine());
		return student;
	}
	public void display(StudentDataZafar dataZafar)
	{
		System.out.println("========"+dataZafar.getName()+" data ==============");
		System.out.println(dataZafar.getSid());
		System.out.println(dataZafar.getName());
		System.out.println(dataZafar.getCity());
		System.out.println(dataZafar.getPhoneNumber());
		System.out.println(dataZafar.getEmail());
	}
	public int insertid(Scanner scanner) {
		System.out.println("enter Student id"); 
		int id=scanner.nextInt();
		scanner.nextLine();
		return id;
	}
}
