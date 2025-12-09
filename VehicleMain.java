package com.inheritance;

public class VehicleMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.accelerate();
		
		Bike b = new Bike();
		b.start();
		b.kickStart();
	}

}
