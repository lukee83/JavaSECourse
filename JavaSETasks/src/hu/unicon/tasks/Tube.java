package hu.unicon.tasks;

public class Tube extends SolidCylinder 
{
	private double innerRadius;

	public Tube(double radius, double height, double density, double innerRadius)
	{
		super(radius, height, density);
		this.innerRadius = innerRadius;
	}

	@Override
	public double getWeight() 
	{
		return super.getWeight() - (new SolidCylinder(innerRadius, super.height, super.density)).getWeight();
	}

	@Override
	public double getSurface() 
	{
		return super.getSurface() + (new Cylinder(innerRadius, super.height)).getSurface() - 4*(Math.pow(innerRadius, 2) * Math.PI);
	}

	@Override
	public double getVolume()
	{
		return super.getVolume() - (new SolidCylinder(innerRadius, super.height, super.density)).getVolume();
	}

}
