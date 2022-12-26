package com.automobile.twowheeler;


import com.automobile.Vehicle;
public class Hero extends Vehicle {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	

	public void  HeroS(String modelName, String registrationNumber, String ownerName, int speed) {
		
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	
	public String getModelName() {
      String  s4 = modelName;
      return s4;
	}

	
	public String getRegistrationNumber() {
      String s5 = registrationNumber;
      return s5;
	}

	
	public String getOwnerName() {
      String s6 = ownerName;
		return s6;
	}

	public int getSpeed() {
      int s7 = speed;
		return s7;
	}
	
	public void radio() {
		System.out.println("Accessing the radio");
	}
	
}
