package week1.day1;

//accessSpecifier keyword ClassName
public class Car {

	//String carMake = "Hyundai";
    
	int fuelCapacity = -350;
	
	// accessSpecifier returnType methodName()

	public void driveCar() {
		int carNumber = 3423;
		
		System.out.println("driving a car");
		System.out.println(fuelCapacity);
		System.out.println(carNumber);

	}

	public void applyBrake() {
		int carNumber = 534543;
		System.out.println("applied Brake");
		System.out.println(fuelCapacity);
		
	
		System.out.println(carNumber);
	}

	
	
	public static void main(String[] args) {

		// ClassName objectName = new ClassName();

		Car myCar = new Car();

		myCar.driveCar();
		myCar.applyBrake();
		
		System.out.println(myCar.fuelCapacity);

	}

}
