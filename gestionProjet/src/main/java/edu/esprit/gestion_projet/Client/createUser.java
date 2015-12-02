package edu.esprit.gestion_projet.Client;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.services.IService.IUserManager;

public class createUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
			//chargement du context
			
			ApplicationContext ctx= new 
					ClassPathXmlApplicationContext("applicationContext.xml");
			
			//Recuperation bean Majeur a travers interface 
			
			IUserManager  userManger= (IUserManager) ctx.getBean("usmanager");	
			
			//Creation d'un User 
		Reporter rep = new Reporter();
		rep.setName("Mohamed louz");
		rep.setE_mail("Mohamed@esprit.tn");
		rep.setCodReporter("ML");
		rep.setLogin("mohamed");
		rep.setPassword("louz");
		//Execution des methodes :creation d'un user 
		userManger.createUser(rep);


		}


}
