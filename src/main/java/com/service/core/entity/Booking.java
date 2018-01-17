package com.service.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookigId;
	
	private String vehicleNumber;
	
	//@ManyToOne(targetEntity = ServiceLine.class)
	private long serviceLineId;

	public long getBookigId() {
		return bookigId;
	}

	public void setBookigId(long bookigId) {
		this.bookigId = bookigId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public long getServiceLineId() {
		return serviceLineId;
	}

	public void setServiceLineId(long serviceLineId) {
		this.serviceLineId = serviceLineId;
	}
	
	
}
