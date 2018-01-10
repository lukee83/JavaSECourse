package hu.unicon.oop;

public class Rectangle extends Shape
{
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
		
		calcPerimeter();
		calcArea();
	}
	
	public void calcPerimeter()
	{
		setPerimeter(2*(a+b));
	}

	public void calcArea()
	{
		setArea(a * b);
	}
	
	public void test()
	{
		System.out.println("Rectangle.test(): OK");
	}
	
}
