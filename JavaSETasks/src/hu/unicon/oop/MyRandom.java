package hu.unicon.oop;

import java.util.Random;

public class MyRandom extends Random 
{
	// for virtual table
	private static final long serialVersionUID = -7673833928466773202L;

	@Override
	public int nextInt(int bound) 
	{
		return super.nextInt(bound)+1;
	}
	
	public int nextIntInterval(int from, int to)
	{
		return from + super.nextInt(to-from+1);
	}
	
}