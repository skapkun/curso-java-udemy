package entities;

import entities.Enums.Color;

public class Circle extends Shape{
	public static final double pi = 3.14159;
	private double radius;
	

	public Circle() { 
	}

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.pow(radius, 2)*pi;
	}


	
	

}
