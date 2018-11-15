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
			Query<Employee> query=session.createQuery("delete from com.omkar.pojo.Employee where eno=:enum");
			query.setParameter("enum", 252);
			
			int status=query.executeUpdate();
			tx.commit();
			System.out.println("Record deleted successfully "+status);
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
