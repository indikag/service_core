package com.service.core;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.service.core.dao.BookingDAO;
import com.service.core.entity.Booking;
import com.service.core.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//http://o7planning.org/en/10201/java-hibernate-tutorial-for-beginners#a77372
		System.out.println("Welcom to the HN");
	
		ArrayList<Booking> list = BookingDAO.getAllBookings();
		Booking aBookingToBeModified = list.get(0);
		//aBookingToBeModified.setVehicleNumber("CAD-683232");
		//BookingDAO.updateBooking(aBookingToBeModified);
		BookingDAO.deleteBooking(aBookingToBeModified);
	}
}