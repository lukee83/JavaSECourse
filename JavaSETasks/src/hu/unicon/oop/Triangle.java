package hu.unicon.oop;

public class Triangle extends Shape 
{
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		calcPerimeter();
		calcArea();
	}
	
	public void calcPerimeter()
	{
		setPerimeter((a+b+c)/2);
	}

	public void calcArea()
	{
		double s = getPerimeter();
		System.out.println("aaa: " + s);
		setArea(Math.sqrt( s * (s - a)*(s - b)*(s - c) ));
	}
}
