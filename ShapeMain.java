package com.inheritance;

public class ShapeMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.area(5);
		
		Rectangle r = new Rectangle();
		r.draw();
		r.area(4, 6);
	}
	

}
