package edu.esprit.gestion_projet.aop;

public class Performance {
	
	private long startTime;
	private long stopTime;
	
	public void startChrono()
	{
		startTime=System.currentTimeMillis();
	}

	public void stopchrono()
	{
		stopTime=System.currentTimeMillis();
		
		System.out.println("ElapsedTime:"+(stopTime-startTime));
		
	}
}
