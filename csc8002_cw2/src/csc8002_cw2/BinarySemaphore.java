package csc8002_cw2;

public class BinarySemaphore extends Semaphore {

	
	public BinarySemaphore()
	{		super();
	}
	
	public BinarySemaphore(int initial)
	{	
		value = (initial>0) ? 1 : 0;
	}	
	
	
	public synchronized void P() throws InterruptedException
	{
		 while (value==0)
		 {
		 wait();
		 }
	value = 0;
	}
	
	public synchronized void V()
	{
		value = 1;
		notify();	
	}		
}
