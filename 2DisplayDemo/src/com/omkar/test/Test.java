package com.omkar.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf= null;
		Session session = null;
		try {
			Configuration cfg = new Configuration();// only object creation in
													// heap section
			cfg.configure("com/omkar/resources/hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			session = sf.openSession();
			Employee emp1 = (Employee) session.get(Employee.class, 222);
			System.out.println("Employee Name:"+emp1.getEname());

			Employee emp2 = (Employee) session.load(Employee.class, 222);
			System.out.println("Employee Name:"+emp2.getEname());

			/*if (emp == null) {
				System.out.println("Employee Data Not Existed");
			} else {
				System.out.println("Employee Details");
				System.out.println("--------------------");
				System.out.println("Employee Number:" + emp.getEno());
				System.out.println("Employee Name:" + emp.getEname());
				System.out.println("Employee Salary:" + emp.getEsal());
				System.out.println("Employee Address:" + emp.getEaddr());
				
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sf.close();
		}
	}

}
