package com.inheritance;

public class Developer extends Employee{
	Developer(String name) {
		super(name);
	}
	void code() {
		System.out.println(name + " writes code.");
	}

}
