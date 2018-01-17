package com.service.core.util;

public class Constant {
	public enum VehicleType {
		CAR("Car"),
		VAN("Van"),
		ALL("All");
		
		private String type;
		
		private VehicleType(String type) {
			this.type = type;
		}
		
		public String type() {
			return type;
		}
		
	}
	
	public enum ServiceType {
		BODY_WASH("Boday Wash"),
		UNDER_WASH("Under Wash"),
		INTERIOR_CLEANING("Interior Cleaning"),
		FULL("Full");
		
		private String type;
		
		private ServiceType(String type) {
			this.type = type;
		}
		
		public String type() {
			return type;
		}
		
	}
	
	public enum Status {
		SUCCESS(true),
		FAIL(false);
		
		private final boolean success;

		Status(boolean success) {
	        this.success = success;
	    }
	    
	    public boolean getSuccessStatus() {
	        return this.success;
	    }
	}
}
