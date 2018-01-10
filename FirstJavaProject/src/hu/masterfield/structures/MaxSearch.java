package hu.masterfield.structures;

import java.util.Random;

public class MaxSearch 
{
	public static int[] arrayGenerator(final int size)
	{
		if(size < 1) return null;
		
		Random r = new Random();
		int[] arr = new int[size];
		

		for(int i = 0; i < arr.length; ++i)
		{
			arr[i] = r.nextInt(366);
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) 
	{
		for(int item : arr) { System.out.print(item + ", ");}
		System.out.println();
	}
	
	public static int getMaxElement(int[] arr) 
	{
		int max = arr[0];
		
		for(int i = 1; i < arr.length; ++i)
		{
			if(max < arr[i]) max = arr[i];
		}
		
		return max;
	}
	
	public static boolean hasElementMod17(int[] arr) 
	{
		for(int item : arr) { if(item%17 == 0) return true; }
		return false;
	}
	
//	public static void main(String[] args) 
//	{
//		final int MERET = 10;
//		int[] arr = arrayGenerator(MERET);
//		printArray(arr);
//		System.out.println("A tomb maximuma: " + getMaxElement(arr));
//	
//		int[] arr2 = arrayGenerator(15);
//		printArray(arr2);
//		System.out.println("Does it have mod17 element? Answer: " + hasElementMod17(arr2));
//		
//		
//	}

	

	


	

}
