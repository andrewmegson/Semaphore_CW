package csc8002_cw2;

public class ThreadH extends Thread {
	

	private int count = 0;
	
	Semaphore HF;

	
	public ThreadH(Semaphore hf)
	{
		HF = hf;
	}
	
	public int getCount()
	{
		return count;
	}
	
	
	
	
	public void run()
	{
		
		
		while(true)
		{
			

			try {
				sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			System.out.println( "H" +  " has printed " + count + " number of times");
			
			HF.V();

		}
	}
	
	
	
}