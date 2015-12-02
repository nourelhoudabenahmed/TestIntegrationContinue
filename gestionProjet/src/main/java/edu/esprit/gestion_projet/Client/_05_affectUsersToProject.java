package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;
import edu.esprit.gestion_projet.services.IService.IUserManager;

public class _05_affectUsersToProject {

	@Test
	public void test() {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IUserManager userManger=(IUserManager) ctx.getBean("usmanager");
		//Recherche d'un projet 
	//Recherche des developpeurs 
	User dev1= userManger.getUserById(1);
	User dev2= userManger.getUserById(2);
	//affecttaion de la liste des developpeurs au projet.
	IProjetIssuesManager  projet_issue_Manager= (IProjetIssuesManager) ctx.getBean("projetIssue");		

	Projet projet =projet_issue_Manager.getProjetById(1);
	dev1.setListprojet(new ArrayList<Projet>());
	dev1.getListprojet().add(projet);
	
	dev2.setListprojet(new ArrayList<Projet>());
	dev2.getListprojet().add(projet);
	
	userManger.updateUser(dev1);
	userManger.updateUser(dev2);

	
	
}
}