package hu.unicon.tasks;

public class SolidCylinder extends Cylinder 
{
	protected double density; // suruseg

	public SolidCylinder(double radius, double height, double density) 
	{
		super(radius, height);
		this.density = density;
	}
	
	public double getWeight()
	{
		return getVolume() * density;
	}
	
}
