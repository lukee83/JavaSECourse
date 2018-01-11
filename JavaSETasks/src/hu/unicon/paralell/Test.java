package hu.unicon.paralell;

public class Test 
{
	private static void do_test1() 
	{
		ThreadA t = new ThreadA(1000);
		t.setPriority(10);
		ThreadA t2 = new ThreadA(1000);
		ThreadA t3 = new ThreadA(1000);
		System.out.println("End of do_test1()");
		
	}
	
	public static void main(String[] args) 
	{
		do_test1();
	}

}
