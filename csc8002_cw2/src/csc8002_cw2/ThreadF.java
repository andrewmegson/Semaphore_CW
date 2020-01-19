package csc8002_cw2;

public class ThreadF extends Thread {
	

	private int count = 0;
	
	BinarySemaphore printF;
	BinarySemaphore printG;
	Semaphore HF;
	
	public ThreadF(BinarySemaphore f, BinarySemaphore g, Semaphore hf)
	{
		printF = f;
		printG = g;
		HF =hf;
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
				printG.P();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				HF.P();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				sleep((long) (Math.random()*100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			System.out.println( "F" +  " has printed " + count + " number of times");
			
			printF.V();
		}
	}
	
	
	
}
