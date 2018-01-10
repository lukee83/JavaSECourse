package hu.unicon.tasks.task7;

public class Account
{
	public Account(String name, int usedMins, int usedSecs)
	{
		// super();
		this.name = name;
		this.usedMins = usedMins;
		this.usedSecs = usedSecs;
		chooseSubsciption();
	}
	
	public void chooseSubsciption() 
	{
		BronzePackage bp = new BronzePackage();
		SilverPackage sp = new SilverPackage();
		GoldPackage   gp = new GoldPackage();
		
		int bf = bp.getInvoice(usedMins, usedSecs);
		int sf = sp.getInvoice(usedMins, usedSecs);
		int gf = gp.getInvoice(usedMins, usedSecs);
		
		if(bf < sf && bf < gf) this.pkg = bp;
		else if( sf < gf ) this.pkg = sp;
		else this.pkg = gp;
		
	}
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", pkg=" + pkg + ", usedMins=" + usedMins + ", usedSecs=" + usedSecs + "]";
	}


	private String name;
	private BronzePackage pkg;
	private int usedMins;
	private int usedSecs;
}
