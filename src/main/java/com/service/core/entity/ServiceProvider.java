package com.service.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ServiceProvider")
public class ServiceProvider {
	@Id
	@Column(name = "serviceProviderId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceProviderId;
	
	@Column(name = "serviceProviderName")
	private String serviceProviderName;
	
	@Column(name = "registeredDate")
	private Date registeredDate;
	
	@Column(name = "isActive")
	private boolean isActive;
}
