package com.service.core.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TimeSlot")
public class TimeSlot {
	@Id
	@Column(name = "slotId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long slotId;
	
	@Column(name = "startTime")
	private Date startTime;
	
	@Column(name = "endTime")
	private Date endTime;
	
	@ManyToOne
	@JoinColumn(name = "serviceLineId")
	private ServiceLine serviceLine;

	public long getSlotId() {
		return slotId;
	}

	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public ServiceLine getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(ServiceLine serviceLine) {
		this.serviceLine = serviceLine;
	}
	
}
