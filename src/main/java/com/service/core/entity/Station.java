package com.service.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Station")
public class Station {

	@Id
	@Column(name = "stationId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stationId;
	
	@Column(name = "stationName")
	private String stationName;
	
	@Column(name = "stationAddress")
	private String stationAddress;
	
	@Column(name = "longitude")
	private double longitude;
	
	@Column(name = "latitude")
	private double latitude;
	
	@Column(name = "contactNo")
	private String contactNo;
	
	@ManyToOne(targetEntity = ServiceProvider.class)
	private long serviceProviderId;

	public long getStationId() {
		return stationId;
	}

	public void setStationId(long stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getStationAddress() {
		return stationAddress;
	}

	public void setStationAddress(String stationAddress) {
		this.stationAddress = stationAddress;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public long getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(long serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
	
}
