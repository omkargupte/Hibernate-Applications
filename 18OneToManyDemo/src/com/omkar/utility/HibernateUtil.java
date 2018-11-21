package com.omkar.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf=null;
	private static Session session=null;
	static//activate hb framework i.e, cfg.configure()
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
	public static void closeSf()
	{
		sf.close();
	}
}
