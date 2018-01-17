package com.service.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ServiceLine {
	@Id
	@Column(name = "serviceLineId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long serviceLineId;
	
	@ManyToOne(targetEntity = ServiceType.class)
	private long serviceTypeId;
	
	@ManyToOne(targetEntity = Station.class)
	private long stationId;
}
