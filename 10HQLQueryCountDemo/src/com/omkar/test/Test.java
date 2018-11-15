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
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			@SuppressWarnings("unchecked")
			Query<Employee> query = session.createQuery("select count(eno) from com.omkar.pojo.Employee");
			List<Employee> count = query.getResultList();
			System.out.println("Count:" + count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
