package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;
import edu.esprit.gestion_projet.services.IService.IUserManager;

public class _03_CreateProject {

	@Test
	public void test() {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IProjetIssuesManager  projet_issue_Manager= (IProjetIssuesManager) ctx.getBean("projetIssue");	
		
		Projet projet = new Projet() ;
		projet.setName("gestion ressources Humaines");
		projet.setDescription("ce projet a pour objectif la gestion des dossiers des employers");
		Date date_Projet = null;
		String date="12/05/2014";
		SimpleDateFormat simpledate=new SimpleDateFormat(date);
		try {
			date_Projet=simpledate.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		projet.setDate(date_Projet);
		
		projet_issue_Manager.createProjet(projet);
		
		

	}

}
