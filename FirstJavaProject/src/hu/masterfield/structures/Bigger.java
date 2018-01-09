package hu.masterfield.structures;

import java.util.Random;

public class Bigger {

	private static void check1() 
	{
		Random r = new Random();
		
		int a = r.nextInt();
		int b = r.nextInt();
		
		System.out.println("elso: " + a);
		System.out.println("masodik: " + b);
		
		if(a < b) 
			System.out.println(b);
		else
			System.out.println(a);
	}
	
	private static void check2() 
	{
		Random r = new Random();
		
		int a = r.nextInt();
		int b = r.nextInt();
		int c = r.nextInt();
		
		System.out.println("elso:     " + a);
		System.out.println("masodik:  " + b);
		System.out.println("harmadik: " + c);

//      ctrl+shift+c		
//		if(a > b && a > c)
//		{
//			System.out.println(a);
//		}
//		else
//		{
//			if(b > c) System.out.println(b);
//			else System.out.println(c);
//		}

	}
	
	
//	public static void main(String[] args) {
//		//check1();
//		check2();
//	}

}
