package com.automobile.fourWheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;

	public void LoganS(String modelName, String registrationNumber, String ownerName, int speed, int gps) {

		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
	}

	public String getModelName() {
		String s1 = modelName;
		return s1;
	}

	public String getRegistrationNumber() {
		String s2 = getRegistrationNumber();
		return s2;
	}

	public String getOwnerName() {
		String s3 = ownerName;
		return s3;
	}

	public int speed() {
		int s4 = speed;
		return s4;
	}

	public int gps() {
		int s5 = gps;
		return s5;
	}

}