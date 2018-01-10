package hu.unicon.tasks.task7;

public class BronzePackage
{
	public BronzePackage()
	{
		super();
		subscriptionFee = 2000;
		minCharge = 18;
		smsCharge = 25;
	}
	
	@Override
	public String toString()
	{
		return this.getClass().getSimpleName();
	}

	public int getInvoice(int chargedMins, int chargedSMS)
	{
		int calculatedCharge = chargedMins * minCharge + chargedSMS * smsCharge;
		
		if (calculatedCharge < this.subscriptionFee)
			return subscriptionFee;
		else
			return calculatedCharge;
	}
	
	protected int subscriptionFee;
	protected int minCharge;
	protected int smsCharge;
}
