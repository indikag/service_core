package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.TimeSlot;
import com.service.core.util.HibernateUtil;

public class TimeSlotDAO {
	
	/**
	 * Get all time slots
	 * @return
	 */
	public static ArrayList<TimeSlot> getAllTimeSlots() {
		ArrayList<TimeSlot> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + TimeSlot.class.getName() + " s";
			Query<TimeSlot> query = session.createQuery(sql);
			bookingList = (ArrayList<TimeSlot>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}
	
	/**
	 * Insert a new time slot
	 * @param timeSlot
	 */
	public static void addNewTimeSlot(TimeSlot timeSlot) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.persist(timeSlot);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Update an existing time slot
	 * @param timeSlotToBeModified
	 */
	public static void updateTimeSlot(TimeSlot timeSlotToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(timeSlotToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
	
	/**
	 * Delete an existing time slot
	 * @param timeSlotToBeDeleted
	 */
	public static void deleteTimeSlot(TimeSlot timeSlotToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(timeSlotToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
