package com.inheritance;

public class Manager extends Employee {
	Manager(String name) {
		super(name);
	}
   void manage() {
	   System.out.println(name + " manages the team.");
   }
}
