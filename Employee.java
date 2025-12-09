package com.inheritance;

public class Employee {
   String name;
   
   Employee(String name) {
	   this.name = name;
   }
   
   void showInfo() {
	   System.out.println("Employee Name: " + name);
   }
}
