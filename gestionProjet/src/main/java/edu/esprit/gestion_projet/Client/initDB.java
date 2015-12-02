package edu.esprit.gestion_projet.Client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class initDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
