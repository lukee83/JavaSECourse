package hu.unicon.tasks.task7;

public class SilverPackage extends BronzePackage 
{
	public SilverPackage() 
	{
		this.subscriptionFee = 3000;
		this.minCharge = 15;
		this.smsCharge = 20;
		
		this.freeSMS = 10;
	}
	
	@Override
	public int getInvoice(int chargedMins, int chargedSMS)
	{
		chargedSMS -= freeSMS;
		if (chargedSMS < 0) chargedSMS = 0;
		
		return super.getInvoice(chargedMins, chargedSMS);
	}
	
	protected int freeSMS;
	
}
