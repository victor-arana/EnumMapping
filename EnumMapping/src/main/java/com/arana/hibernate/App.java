package com.arana.hibernate;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.arana.hibernate.enums.Status;
import com.arana.hibernate.util.HibernateUtil;
import com.arana.hibernate.vo.Activity;

public class App {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		
		Transaction tx = session.beginTransaction();
		Activity date = new Activity(Status.ACTIVE);
		Activity date2 = new Activity(Status.DELETED);
		Activity date3 = new Activity(Status.PENDING);
		
		session.save(date);
		session.save(date2);
		session.save(date3);
		tx.commit();
		
		List<Activity> activities = (List<Activity>) session.createQuery("from Activity").list();
		System.out.println(Arrays.toString(activities.toArray()));
		
		session.close();
		HibernateUtil.shutdown();

	}

}
