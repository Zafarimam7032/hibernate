package com.zafar.MapingTechnique;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zafar.many.to.many.City;
import com.zafar.many.to.many.Village;

public class ManytoMany {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("dbcon.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Village village = new Village();
		village.setVno(3);
		village.setVillname("Khadar");
		Village village2 = new Village();
		village2.setVno(4);
		village2.setVillname("jj collony");
		City city = new City();
		city.setCid(3);
		city.setName("new Delhi");
		City city2 = new City();
		city2.setCid(4);
		city2.setName("Hyderabad");
		List<City> cities = new ArrayList<City>();
		cities.add(city);
		cities.add(city2);
		village.setCities(cities);
		List<City> cities1 = new ArrayList<City>();
		cities1.add(city);
		cities1.add(city2);
		village.setCities(cities1);
		List<Village> villages = new ArrayList<Village>();
		villages.add(village);
		villages.add(village2);
		city.setVillage(villages);
		List<Village> villages1 = new ArrayList<Village>();
		villages1.add(village);
		villages1.add(village2);
		city2.setVillage(villages1);
		session.save(city);
		session.save(city2);
		session.save(village);
		session.save(village2);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.clear();
		session.close();
		factory.close();

	}
}
