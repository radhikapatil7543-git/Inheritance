package com.inheritance;

public class EmployeeMain {
	public static void main(String[] args) {
		Manager m = new Manager("Deepali");
		m.showInfo();
		m.manage();
		Developer d = new Developer("Vaishnavi");
		d.showInfo();
		d.code();
	}

}
