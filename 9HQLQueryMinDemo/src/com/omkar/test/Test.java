package com.omkar.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			@SuppressWarnings("unchecked")
			Query<Employee> query = session.createQuery(
					"from com.omkar.pojo.Employee where esal=(select min(esal) from com.omkar.pojo.Employee)");
			List<Employee> list = query.getResultList();
			System.out.println(list);
		} catch (Exception e) {

		}

	}

}
