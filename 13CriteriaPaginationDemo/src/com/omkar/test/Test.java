package com.omkar.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			@SuppressWarnings("deprecation")
			Criteria cr=session.createCriteria(Employee.class);
			
			cr.setFirstResult(2);
			cr.setMaxResults(5);
			@SuppressWarnings("unchecked")
			List<Employee> li=cr.list();
			System.out.println(li);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
