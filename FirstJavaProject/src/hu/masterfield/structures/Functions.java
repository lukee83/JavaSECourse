package hu.masterfield.structures;

public class Functions 
{

	public static void greetings()
	{
		System.out.println("szeva!");
	}
	
	public static void greetings(String s)
	{
		System.out.print("greetings(String): ");
		System.out.println("szeva " + s + "!" );
	}
	
	public static void greetings(StringBuffer sb)
	{
		System.out.print("greetings(Stringbuffer): ");
		System.out.println("szeva: " + sb.toString());
	}
	
	public static void testFunc(int variable)
	{
		++variable;
		// egyszeru tipus
		// does not write back
	}
	
	public static void testFunc(String s)
	{
		s = "kkkkkkkkk";
		// egyszeru tipus
		// does not write back
	}
	
	public static void testArrayFunc(int[] arr)
	{
		// osszetett tipus, tobb primitiv adatbol all, referenciat kap, ami vissza is irodik
		// array will be set
		arr[0] = 22;
		arr[1] = 33;
	}
	
	public static int pow3(int param)
	{
		return param * param * param;
	}
	
	public static double pow3(double param)
	{
		return param * param * param;
	}
	
	
	public static void mainnn(String[] args) 
	{
		// TODO Auto-generated method stub
		greetings();
		greetings("béla");
		greetings(new StringBuffer("béla"));
		
		int testVariable = 5;
		int[] testArray = {1,2,3};
		testFunc(testVariable);
		testArrayFunc(testArray);
		
		
		System.out.println("testVariable after testFunc(): " + testVariable);
		System.out.println("testArray[0, 1, 2] after testArrayFunc(): " + testArray[0] + ", "+ testArray[1]+ ", "+ testArray[2]);
		
		/*
		 * will not be modified because it is String
		String b = "Bela";
		testFunc(b);
		System.out.println(b);
		*/
		
		System.out.println("kob(3): " + pow3(3) );
		
		// there is no auto cast!!! please implement float/double version
		System.out.println("kob(1.5): " + pow3(1.5) );
		
		
		
	}

	
	
}
