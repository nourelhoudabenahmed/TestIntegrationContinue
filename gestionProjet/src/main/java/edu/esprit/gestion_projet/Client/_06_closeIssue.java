package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;

public class _06_closeIssue {

	@Test
	public void test() {
		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IProjetIssuesManager  projet_issue_Manager= (IProjetIssuesManager) ctx.getBean("projetIssue");		
	
	Issues issue= projet_issue_Manager.getIssuesById(1);
	issue.setDescription("close Issue");
	projet_issue_Manager.updateIssue(issue);
	
}
}