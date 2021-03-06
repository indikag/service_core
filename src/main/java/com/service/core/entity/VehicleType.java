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

	public long getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(long vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public ServiceProvider getProvider() {
		return provider;
	}

	public void setProvider(ServiceProvider provider) {
		this.provider = provider;
	}
	
}
