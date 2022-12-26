package com.automobile.twowheeler;

import com.automobile.Vehicle;
 
public class Honda extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	


	public void HondaS(String modelName, String registrationNumber, String ownerName, int speed) {
		
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}


	public String getModelName() {
        String s = modelName;
	return s;
	}

	public String getRegistrationNumber() {
        String s2 =  registrationNumber;
		return s2;
	}


	public String getOwnerName() {
        String ownername = ownerName;
		return ownerName;
	}
	
	public int getSpeed() {
        int s3 = speed;
		return s3;
	}
	
	public void cdplayer() {
		System.out.println("Accessing CD Player.");
	}
}
