package hu.unicon.paralell;

// if you put 'static' into the class, you will not be able to run it as thread

// extends Thread OR interface: implements runnable

public class ThreadA extends Thread
{

	private long wait;
	
	public ThreadA(long waiting) 
	{
		// super();
		this.wait = waiting;
		this.start();
	}

	@Override
	public void run() 
	{
		// super.run();
		
		for (int i = 0; i < 20; i++) 
		{
			try {
				this.sleep(wait);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + ", " + this.currentThread().getId());
		}
		
		
	}

}
