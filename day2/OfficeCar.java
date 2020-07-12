package week1.day2;

import week1.day1.*;

public class OfficeCar {
	
	String carColor = "red";

	public void driveCar() {
		System.out.println("driving car");

	}
	
	
	
	public static void main(String[] args) {
		MyCar mc = new MyCar();
		
		mc.applyBrake();
		
		
		OfficeCar oc = new OfficeCar();
		
		oc.driveCar();
		
		/*
		 * Car obj = new Car();
		 * 
		 * obj.soundHorn();
		 */
		Car obj = new Car();
		
		obj.soundHorn();
		
		System.out.println(obj.fuelCapacity);
		
		
		
		
		
		

	}



}
