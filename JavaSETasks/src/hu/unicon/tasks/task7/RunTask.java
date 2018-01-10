package hu.unicon.tasks.task7;

public class RunTask {

	private static void testBronze()
	{
		BronzePackage p = new BronzePackage();
		System.out.println(p.getInvoice(10, 10));
		System.out.println(p.getInvoice(100, 100));
	}
	
	private static void testSilver()
	{
		SilverPackage p = new SilverPackage();
		System.out.println(p.getInvoice(10, 10));
		System.out.println(p.getInvoice(100, 100));
	}
	
	private static void testGold()
	{
		GoldPackage p = new GoldPackage();
		System.out.println(p.getInvoice(10, 10));
		System.out.println(p.getInvoice(100, 100));
	}
	
	private static void testAccount()
	{
		Account Steve = new Account("Istvan", 10, 10);
		System.out.println(Steve);
		
		Account Kriszta = new Account("Kriszta", 200, 200);
		System.out.println(Kriszta);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		testBronze();
		testSilver();
		testGold();
		testAccount();
	}

}
