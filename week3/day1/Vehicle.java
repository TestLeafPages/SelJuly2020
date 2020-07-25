package week3.day1;

public class Vehicle {
	
	private String name ="xcent";
	
	public void applyBrake() {
		
		int x =10;
		
		System.out.println("applied Brake");

	}
	
	public void soundHorn() {
		System.out.println("sound Horn");

	}
	
	
	public static void main(String[] args) {
		
		Vehicle veh = new Vehicle();
		
		veh.applyBrake();
	}
	


}
