package com.automobile.fourWheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int tempControl;

	public void FordS(String modelName, String registrationNumber, String ownerName, int speed, int tempControl) {

		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.tempControl = tempControl;
	}

	public String getModelName() {
		String s1 = modelName;
		return s1;
	}

	public String getRegistrationNumber() {
		String s2 = registrationNumber;
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

	public int tempControl() {
		int s5 = tempControl;
		return s5;
	}

}
