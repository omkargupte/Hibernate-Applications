package com.omkar.test;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.omkar.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			@SuppressWarnings("deprecation")
			Criteria c=session.createCriteria(Employee.class);
			// ***Adding Restriction Methods
				//1. c.add(Restrictions.lt("esal", 6000f));
				//2. c.add(Restrictions.le("esal", 6000f));
				//3. c.add(Restrictions.gt("esal", 8200f));
				//4. c.add(Restrictions.ge("esal", 7500f));
				/*5.*/c.add(Restrictions.ne("esal", 6000f));//If value is found ne() method does not print record
				//6. c.add(Restrictions.eq("esal", 9000f));//If value if found eq() method prints the record else does not print anything.
				//7. c.add(Restrictions.between("eno", 200, 500));
				//8. c.add(Restrictions.like("ename", "BBB"));
			// ***End of Restriction Methods
			
			// *** Adding Ordering Methods
				/*1.*/ //c.addOrder(Order.asc("eaddr"));
				//2. c.addOrder(Order.desc("esal"));
			// ****** End of Ordering Methods
			@SuppressWarnings("unchecked")
			List<Employee> list=c.list();
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
