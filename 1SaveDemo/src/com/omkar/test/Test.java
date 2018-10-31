package com.omkar.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args)throws Exception {
		Configuration cfg=new Configuration();
		cfg.configure();//search hibernate.cfg.xml
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Employee emp=new Employee();
		emp.setEno(111);
		emp.setEname("AAA");
		emp.setEsal(5000);
		emp.setEaddr("Mumbai");
		session.save(emp);
		tx.commit();
		System.out.println("Employee data is saved successfully!!");
		session.close();
		sf.close();
	}

}
