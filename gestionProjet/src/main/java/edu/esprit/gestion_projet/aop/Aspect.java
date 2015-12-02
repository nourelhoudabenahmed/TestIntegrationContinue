package edu.esprit.gestion_projet.aop;

public class Aspect {
	
	
	public void showbefore()
	{
		System.out.println("Debut execution de la requete");
	}
 
	public void showAfter()
	{
		System.out.println("Fin execution de la requete");
	}
}
