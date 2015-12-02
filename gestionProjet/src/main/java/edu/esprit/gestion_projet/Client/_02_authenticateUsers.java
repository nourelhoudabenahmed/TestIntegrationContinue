package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.services.IService.IUserManager;

public class _02_authenticateUsers {

	@Test
	public void test() {

		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserManager userManger=(IUserManager) ctx.getBean("usmanager");
		userManger.authentication("ahmed", "ahmed");
		System.out.println("OK");
		
	
	
	}

}
