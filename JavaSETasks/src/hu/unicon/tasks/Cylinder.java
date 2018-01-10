package hu.unicon.tasks;

public class Cylinder 
{
	protected double radius;
	protected double height;

	
	public Cylinder(double radius, double height) 
	{
		this.radius = radius;
		this.height = height;
	}

	public double getSurface()
	{
		// felszin ( kerulet * magassag)
		return (Math.pow(radius, 2) * Math.PI * 2)+ (2 * radius * Math.PI * height);
	}
	
	public double getVolume()
	{
		// terfogat ( terulet * magassag )
		return Math.pow(radius, 2) * Math.PI * height;
	}
	
}
