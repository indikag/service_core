package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.ServiceType;
import com.service.core.util.HibernateUtil;

public class ServiceTypeDAO {
	
	/**
	 * Get all service types
	 * @return
	 */
	public static ArrayList<ServiceType> getAllServiceType() {
		ArrayList<ServiceType> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + ServiceType.class.getName() + " s";
			Query<ServiceType> query = session.createQuery(sql);
			bookingList = (ArrayList<ServiceType>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}
	
	/**
	 * Insert a new service type
	 * @param serviceProvider
	 */
	public static void addNewServiceType(ServiceType serviceProvider) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.persist(serviceProvider);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Update an existing service type
	 * @param serviceTypeToBeModified
	 */
	public static void updateServiceType(ServiceType serviceTypeToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(serviceTypeToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Delete an existing service type
	 * @param serviceTypeToBeDeleted
	 */
	public static void deleteServiceType(ServiceType serviceTypeToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(serviceTypeToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
