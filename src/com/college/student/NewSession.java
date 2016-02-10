package com.college.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewSession {
	
	private static SessionFactory factory=null;

	static{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("Configuration: "+cfg);
		factory=cfg.buildSessionFactory();
		
	}
	public static Session getSession() {
		return factory.openSession();
	}
}
