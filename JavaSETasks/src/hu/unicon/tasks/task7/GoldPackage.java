package hu.unicon.tasks.task7;

public class GoldPackage extends SilverPackage 
{
	public GoldPackage() 
	{
		this.subscriptionFee = 4000;
		this.minCharge = 12;
		this.smsCharge = 15;
		
		this.freeSMS = 20;
		this.freeMin = 30;
	}
	
	@Override
	public int getInvoice(int chargedMins, int chargedSMS)
	{
		chargedMins -= freeMin;
		if (chargedMins < 0) chargedMins = 0;
		
		return super.getInvoice(chargedMins, chargedSMS);
	}
	
	private int freeMin;
}
