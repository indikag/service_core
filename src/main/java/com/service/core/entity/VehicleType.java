package com.service.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * All services may not service all type of vehicles.
 * @author indikagunawardana
 *
 */
@Entity
@Table(name = "VehicleType")
public class VehicleType {

	@Id
	@Column(name = "vehicleTypeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vehicleTypeId;
	
	@Column(name = "vehicleType")
	private String vehicleType;
	
	@ManyToOne
	@JoinColumn(name = "serviceProviderId")
	private ServiceProvider provider;
}
