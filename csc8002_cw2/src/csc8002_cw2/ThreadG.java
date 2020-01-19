package csc8002_cw2;

public class ThreadG extends Thread {
	
	
	private int count = 0;
	
	BinarySemaphore printF;
	BinarySemaphore printG;
	
	public ThreadG(BinarySemaphore f, BinarySemaphore g)
	{
		printF = f;
		printG = g;
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
				printF.P();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    									//wait till F has printed
			try {
				sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			
			count++;
			System.out.println( "G" +  " has printed " + count + " number of times");
			
			printG.V();   					  //signal G has printed
		}
	}
	
	
	
}
