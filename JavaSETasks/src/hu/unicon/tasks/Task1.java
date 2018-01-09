package hu.unicon.tasks;

import java.util.Random;

public class Task1 {

	private static void task1(String[] args)
	{
		System.out.println(Integer.parseInt(args[0]) * args[0].length());
	}
	
	private static void task2()
	{
		Random r = new Random();
		int meret = r.nextInt(11) + 20;
		int[] arr = new int[meret];
		
		boolean b = true;
		for(int i = 0; (i < arr.length && b); ++i)
		{
			arr[i] = 1001 + r.nextInt(999);
			if(i == 5) b = false;
		}
		
		float avg = 0;
		
		for(int item : arr)
		{
			avg += item;
		}
		
		avg/=(float)arr.length;
		
		System.out.println(avg);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//task1(args);
		task2();
		
		
	}

}
