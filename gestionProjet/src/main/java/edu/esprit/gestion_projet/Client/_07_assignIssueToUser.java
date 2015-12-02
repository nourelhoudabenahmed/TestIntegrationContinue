package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;
import edu.esprit.gestion_projet.services.IService.IUserManager;

public class _07_assignIssueToUser {

	@Test
	public void test() {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IUserManager userManger=(IUserManager) ctx.getBean("usmanager");
		IProjetIssuesManager  projet_issue_Manager= (IProjetIssuesManager) ctx.getBean("projetIssue");		

	//Recherche d'un  developpeur
	User dev1= userManger.getUserById(1);

	//affecttaion de la liste des issues au developpeur.
	Issues issue=projet_issue_Manager.getIssuesById(2);
	
	dev1.setListIssues(new ArrayList<Issues>());
	dev1.getListIssues().add(issue);
	
	userManger.updateUser(dev1);
	
	
	}

}
