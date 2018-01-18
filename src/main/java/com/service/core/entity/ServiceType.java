package com.service.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contains service types such as full service, under-wash service, vacuum cleaning, body wash etc. 
 * @author indikagunawardana
 *
 */
@Entity
@Table(name = "ServiceType")
public class ServiceType {
	@Id
	@Column(name = "serviceTypeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceTypeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "serviceTimeInMinutes")
	private int serviceTimeInMinutes;
	
	@ManyToOne(targetEntity = ServiceProvider.class)
	private long serviceProviderId;

	public long getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(long serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getServiceTimeInMinutes() {
		return serviceTimeInMinutes;
	}

	public void setServiceTimeInMinutes(int serviceTimeInMinutes) {
		this.serviceTimeInMinutes = serviceTimeInMinutes;
	}

	public long getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(long serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}
	
}
