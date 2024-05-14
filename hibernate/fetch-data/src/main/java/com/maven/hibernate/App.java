package com.maven.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = ses.beginTransaction();

		tx.commit();
		ses.close();
	}
}
