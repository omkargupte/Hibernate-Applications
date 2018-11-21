package com.omkar.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null;
	private static Session session=null;
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		sf=cfg.buildSessionFactory();
	}
	public static Session getSession()
	{
		session=sf.openSession();
		return session;
	}
	public static void closeSession()
	{
		session.close();
	}
	public static void closeSessionFactory()
	{
		sf.close();
	}
}
