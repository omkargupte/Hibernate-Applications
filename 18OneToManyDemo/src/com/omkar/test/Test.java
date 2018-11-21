package com.omkar.test;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.omkar.pojo.Course;
import com.omkar.pojo.Student;
import com.omkar.utility.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSession();
			Transaction tx=session.beginTransaction();
			//perpare parent class objects
			Student stud=new Student();
			stud.setRollno(1);
			stud.setSname("Omkar");
			stud.setSmarks(76.15f);
			
			//prepare child class objects
			Course c1=new Course();
			Course c2=new Course();
			
			c1.setCno(101);
			c1.setCname("Hibernate");
			
			c2.setCno(102);
			c2.setCname("Spring");
			
			//prepare Set Object
			
			Set<Course> hs=new HashSet<Course>();
			hs.add(c1);
			hs.add(c2);
			
			//add child object to parent class
			stud.setCno(hs);
			
			//save
			session.save(stud);
			tx.commit();
			System.out.println("Record Added Successfully!!!");
			HibernateUtil.closeSession();
			HibernateUtil.closeSf();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
