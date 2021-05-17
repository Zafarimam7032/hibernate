package com.zafar.UpdateAndDeleteInformation;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zafar.deleteandupdate.DeleteAndUpdate;
import com.zafar.insert.and.select.InsertAndSelect;

public class App {
	public static void main(String[] args) {
		System.out.println("update and delete operation");
		Configuration configuration = new Configuration();
		configuration.configure("dbcon.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		App app=new App();
		app.manage(factory);
		factory.close();

	}
		// System.out.println(factory);
		public void manage(SessionFactory factory) {
		Scanner scn = new Scanner(System.in);
		DeleteAndUpdate obj = new DeleteAndUpdate();
		
		System.out.println("whicn operation do you want to persform:");
		System.out.println("Insert---------> press 1");
		System.out.println("Select----specific data by bid-----> press 2");
		System.out.println("Select-----all user data----> press 3");
		System.out.println("update---------> press 4");
		System.out.println("delete---------> press 5");
		int key = scn.nextInt();
		scn.nextLine();
		InsertAndSelect insertAndSelect = new InsertAndSelect();
		switch (key) {
		case 1:
			System.out.println("Inseat Operation:");
			insertAndSelect.insert(factory, scn);
			break;
		case 2:
			System.out.println("Select Operation");
			insertAndSelect.selectid(factory, scn);

			break;

		case 3:
			System.out.println("all information of all users");
			insertAndSelect.selectAll(factory);
			break;
		case 4:
			System.out.println("==============update operation=====");
			obj.update(factory, scn);
			break;
		case 5:
			System.out.println("==========delete operation ===========");
			obj.deleteid(factory, scn);
			break;
		default:
			break;

		}
		System.out.println("if you want to  perform more operation then press 1");
		int i=scn.nextInt();
		if(i==1)
		{
			manage(factory);
		}
		else {
			System.exit(0);
		}


	}
}
