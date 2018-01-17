package com.service.core.util;

import com.service.core.util.Constant.Status;

public class DBStatus {

	private Status successStatus;
	private Object response;
	private String message;
	public DBStatus(Status successStatus, Object response, String message) {
		super();
		this.successStatus = successStatus;
		this.response = response;
		this.message = message;
	}
	public Status getSuccessStatus() {
		return successStatus;
	}
	public void setSuccessStatus(Status successStatus) {
		this.successStatus = successStatus;
	}
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((response == null) ? 0 : response.hashCode());
		result = prime * result + ((successStatus == null) ? 0 : successStatus.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DBStatus other = (DBStatus) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (response == null) {
			if (other.response != null)
				return false;
		} else if (!response.equals(other.response))
			return false;
		if (successStatus != other.successStatus)
			return false;
		return true;
	}
	
	
}
