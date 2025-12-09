package com.inheritance;

public class ApplianceMain {
	public static void main(String[] args) {
		WashingMachine w = new WashingMachine();
		w.powerOn();
		w.powerOff();
		w.washClothes();
		
		Refrigerator r = new Refrigerator();
		r.powerOn();
		r.powerOff();
		r.coolFood();
	}

}
