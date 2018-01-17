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
}
