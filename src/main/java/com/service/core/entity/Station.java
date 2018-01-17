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
}
