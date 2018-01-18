package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.ServiceLine;
import com.service.core.util.HibernateUtil;

public class ServiceLineDAO {
	/**
	 * Get all service lines
	 * @return
	 */
	public static ArrayList<ServiceLine> getAllServiceLines() {
		ArrayList<ServiceLine> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + ServiceLine.class.getName() + " s";
			Query<ServiceLine> query = session.createQuery(sql);
			bookingList = (ArrayList<ServiceLine>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}
	
	/**
	 * Insert a new service line
	 * @param serviceLine
	 */
	public static void addNewServiceLine(ServiceLine serviceLine) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.persist(serviceLine);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Update an existing service line
	 * @param serviceLineToBeModified
	 */
	public static void updateServiceLine(ServiceLine serviceLineToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(serviceLineToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Delete an existing service line
	 * @param serviceLineToBeDeleted
	 */
	public static void deleteServiceLine(ServiceLine serviceLineToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(serviceLineToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
