package com.service.core.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.service.core.entity.VehicleType;
import com.service.core.util.HibernateUtil;

public class VehicleTypeDAO {
	
	/**
	 * Get all vehicle types
	 * @return
	 */
	public static ArrayList<VehicleType> getAllVehicleTypes() {
		ArrayList<VehicleType> bookingList = null;
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			String sql = "Select s from " + VehicleType.class.getName() + " s";
			Query<VehicleType> query = session.createQuery(sql);
			bookingList = (ArrayList<VehicleType>) query.getResultList();
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
		}
		return bookingList;
	}

	/**
	 * Insert a new vehicle type
	 * @param vehicleType
	 */
	public static void addNewVehicleType(VehicleType vehicleType) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.persist(vehicleType);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	/**
	 * Update an existing vehicle type
	 * @param vehivleTypeToBeModified
	 */
	public static void updateVehicleType(VehicleType vehivleTypeToBeModified) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.update(vehivleTypeToBeModified);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

	/**
	 * Delete an existing vehicle type
	 * @param vehicleTypeToBeDeleted
	 */
	public static void deleteVehicleType(VehicleType vehicleTypeToBeDeleted) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			session.getTransaction().begin();
			session.delete(vehicleTypeToBeDeleted);
			session.flush();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
