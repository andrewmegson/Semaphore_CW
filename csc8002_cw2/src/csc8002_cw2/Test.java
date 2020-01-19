package csc8002_cw2;

public class Test {

	public static void main(String[] args) throws InterruptedException
	{
		BinarySemaphore printF = new BinarySemaphore();
		BinarySemaphore printG = new BinarySemaphore(1);
		
		Semaphore HF = new Semaphore();
		
		ThreadF threadF = new ThreadF(printF, printG, HF);
		ThreadG threadG = new ThreadG(printF, printG);
		ThreadH threadH = new ThreadH(HF);
		
		threadF.start();
		threadG.start();
		threadH.start();
		
		Thread.sleep(1000);
		
		
		
		
		System.exit(0);
		
	}
}
