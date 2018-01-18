package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.ServiceProvider;
import com.service.core.util.HibernateUtil;

public class ServiceProviderDAO {
	
	/**
	 * Get all service providers 
	 * @return
	 */
	public static ArrayList<ServiceProvider> getAllServiceProviders() {
		ArrayList<ServiceProvider> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + ServiceProvider.class.getName() + " s";
			Query<ServiceProvider> query = session.createQuery(sql);
			bookingList = (ArrayList<ServiceProvider>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}
	
	/**
	 * Insert a new service provider
	 * @param serviceProvider
	 */
	public static void addNewServiceProvider(ServiceProvider serviceProvider) {
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
	 * Update an existing service provider
	 * @param serviceProviderToBeModified
	 */
	public static void updateServiceProvider(ServiceProvider serviceProviderToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(serviceProviderToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Delete an existing service provider
	 * @param serviceProviderToBeDeleted
	 */
	public static void deleteServiceProvider(ServiceProvider serviceProviderToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(serviceProviderToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
