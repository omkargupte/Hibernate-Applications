package com.omkar.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try
		{
			Configuration cfg=new Configuration();
			cfg.configure("com/omkar/resources/hibernate.cfg.xml"); 
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Employee emp=new Employee();
			emp.setEno(101010);
			emp.setEname("CCC");
			emp.setEsal(7500);
			emp.setEaddr("Nashik");
			session.update(emp);
			tx.commit();
			System.out.println("Updated successfully!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
		}
	}

}
