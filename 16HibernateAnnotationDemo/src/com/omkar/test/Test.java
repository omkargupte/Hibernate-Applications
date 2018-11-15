package com.omkar.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Employee emp=new Employee();
			emp.setEno(666);
			emp.setEname("FFF");
			emp.setEsal(10500);
			emp.setEaddr("Nagpur");
			session.save(emp);
			tx.commit();
			System.out.println("Employee Record added successfully");
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
