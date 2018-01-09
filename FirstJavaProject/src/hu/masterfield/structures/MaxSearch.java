package hu.masterfield.structures;

import java.util.Random;

public class MaxSearch 
{
	private static int[] arrayGenerator(final int size)
	{
		if(size < 1) return null;
		
		Random r = new Random();
		int[] arr = new int[size];
		

		for(int i = 0; i < arr.length; ++i)
		{
			arr[i] = r.nextInt(100);
		}
		
		return arr;
	}
	
	private static void printArray(int[] arr) 
	{
		for(int item : arr) { System.out.print(item + ", ");}
		System.out.println();
	}
	
	private static int getMaxElement(int[] arr) 
	{
		int max = arr[0];
		
		for(int i = 1; i < arr.length; ++i)
		{
			if(max < arr[i]) max = arr[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) 
	{
		final int MERET = 10;
		int[] arr = arrayGenerator(MERET);
		printArray(arr);
		System.out.println("A tomb maximuma: " + getMaxElement(arr));
		
	}

	


	

}
