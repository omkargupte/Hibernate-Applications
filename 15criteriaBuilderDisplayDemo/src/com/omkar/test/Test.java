package com.omkar.test;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

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
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaQuery<Employee> cq=builder.createQuery(Employee.class);
			cq.from(Employee.class);
			List<Employee> list=session.createQuery(cq).getResultList();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
