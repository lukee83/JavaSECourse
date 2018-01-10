package hu.unicon.oop;

public class Shape
{
	private double perimeter; // kerulet
	private double area;      // terulet
	
	public double getPerimeter()
	{
		return perimeter;
	}
	
	public double getArea()
	{
		return area;
	}

	protected void setArea(double area) {
		this.area = area;
	}

	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}
