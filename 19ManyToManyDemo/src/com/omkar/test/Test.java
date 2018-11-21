package com.omkar.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.omkar.pojo.Customer;
import com.omkar.pojo.Product;
import com.omkar.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		try {
			Session session=HibernateUtil.getSession();
			Transaction tx=session.beginTransaction();
			
			Product p1=new Product();
			Product p2=new Product();
			p1.setPid(10);
			p1.setPname("Lg TV");
			p1.setPamount(150000f);
			p2.setPid(11);
			p2.setPname("JBL Sound");
			p2.setPamount(35000f);
			
			Customer c1=new Customer();
			Customer c2=new Customer();
			c1.setCid(101);
			c1.setCname("Ram");
			c1.setCaddr("Pune");
			c1.setCphno(9895652025l);
			c2.setCid(102);
			c2.setCname("Sham");
			c2.setCaddr("Nashik");
			c2.setCphno(9999988888l);
			
			//store Customer records in Set
			Set<Customer> hs=new HashSet<Customer>();
			//Set<Customer> hs2=new HashSet<Customer>();
			hs.add(c1);
			hs.add(c2);
			
			//Set HashSet records to the Product Object
			p1.setCid(hs);
			p2.setCid(hs);
			
			//Save the Product Objects 
			session.save(p1);
			session.save(p2);
			tx.commit();
			
			HibernateUtil.closeSession();
			HibernateUtil.closeSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
