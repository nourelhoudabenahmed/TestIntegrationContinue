package edu.esprit.gestion_projet.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;

public class Logger {
	
	public void logMtehodEntry(JoinPoint jp)
	{
		
		String name=jp.getSignature().toLongString();
		StringBuffer sb= new StringBuffer(name);

		Object[]args=jp.getArgs();
		
		for(int i=0;i<args.length;i++)
		{
			Object o=args[i];
			sb.append(o);
			sb.append(name+"les arguments passés:\n"+o);
			System.out.println(sb);
		}
		
		
	}
	
	public void logMethodAfterReturning(StaticPart jp,Object result)
	{
		String signature=jp.getSignature().toLongString();
		System.out.println("La valeur de retour de la methode"+result);
		
	
	}

}
