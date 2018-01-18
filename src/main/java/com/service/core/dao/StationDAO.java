package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.Station;
import com.service.core.util.HibernateUtil;

public class StationDAO {
	
	/**
	 * Get all stations
	 * @return
	 */
	public static ArrayList<Station> getAllStation() {
		ArrayList<Station> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + Station.class.getName() + " s";
			Query<Station> query = session.createQuery(sql);
			bookingList = (ArrayList<Station>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}
	
	/**
	 * Add a new station
	 * @param station
	 */
	public static void addNewServiceLine(Station station) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.persist(station);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Update an existing station
	 * @param stationToBeModified
	 */
	public static void updateServiceLine(Station stationToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(stationToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Delete an existing station
	 * @param stationToBeDeleted
	 */
	public static void deleteServiceLine(Station stationToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(stationToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
