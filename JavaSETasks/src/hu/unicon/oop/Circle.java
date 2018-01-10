package hu.unicon.oop;

public class Circle extends Shape 
{
	private double radius;

	public Circle(double radius) 
	{
		//super();
		this.radius = radius;
		calcPerimeter();
		calcArea();
	}

	public void calcPerimeter()
	{
		setPerimeter(2*radius*Math.PI);
	}

	public void calcArea()
	{
		setArea(Math.pow(radius, 2) * Math.PI);
	}
	
	public void test()
	{
		System.out.println("Circle.test(): OK");
	}
	
	
}
