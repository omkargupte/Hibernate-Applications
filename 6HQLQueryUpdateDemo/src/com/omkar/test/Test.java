package com.omkar.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<Employee> query=session.createQuery("update com.omkar.pojo.Employee set ename=:en,eaddr=:ea where eno=:enum");
			query.setParameter("en", "FFF");
			query.setParameter("ea", "Jalgoan");
			query.setParameter("enum", 252);
			
			int status=query.executeUpdate();
			
			System.out.println("Employee Data Updated Successfully "+status);
			tx.commit();
			session.close();
			sf.close();
		} catch (Exception e) {
		
		}

	}

}
