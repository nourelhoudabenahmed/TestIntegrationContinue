package edu.esprit.gestion_projet.Client;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;

public class _04_createIssuesByProject {

	@Test
	public void test() {

		ApplicationContext ctx= new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Recuperation bean Majeur a travers interface 
		
		IProjetIssuesManager  projet_issue_Manager= (IProjetIssuesManager) ctx.getBean("projetIssue");	
		List<Issues> listIssue= new ArrayList<Issues>();
		//Creation Issues1
		Issues issue1= new Issues();
		issue1.setName("calculePaye");
		issue1.setDescription("calcul de salaires des employers");
		issue1.setPriority("hight");
		issue1.setType("Tache de developpement");
		Date date_start = null;
		Date date_end = null;
		Date date_estimation=null;

		String date1="14/05/2014";
		String date2="19/05/2014";
		String date3="19/05/2014";

		SimpleDateFormat simpledate=new SimpleDateFormat(date1);
		SimpleDateFormat simpledate2=new SimpleDateFormat(date2);
		SimpleDateFormat simpledate3=new SimpleDateFormat(date3);

		
		try {
			date_start=simpledate.parse(date1);
			date_end=simpledate2.parse(date2);
			date_estimation=simpledate3.parse(date3);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		issue1.setDateStart(date_start);
		issue1.setDateEnd(date_end);
		issue1.setEstimationTime(date_estimation);
		
		
		//Creation Issue 2
		Issues issue2= new Issues();
		issue2.setName("calculePaye");
		issue2.setDescription("gestion des employers");
		issue2.setPriority("hight");
		issue2.setType("Correction bug mantis ");
		Date date_start2 = null;
		Date date_end2 = null;
		Date date_estimation2=null;

		String date1_2="16/05/2014";
		String date2_2="17/05/2014";
		String date3_2="17/05/2014";

		SimpleDateFormat simpledatee2=new SimpleDateFormat(date1_2);
		SimpleDateFormat simpledate2_2=new SimpleDateFormat(date2_2);
		SimpleDateFormat simpledate3_2=new SimpleDateFormat(date3_2);

		
		try {
			date_start2=simpledatee2.parse(date1_2);
			date_end2=simpledate2_2.parse(date2_2);
			date_estimation2=simpledate3_2.parse(date3_2);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		issue2.setDateStart(date_start2);
		issue2.setDateEnd(date_end2);
		issue2.setEstimationTime(date_estimation2);
		
		
		//Ajout des Issues dans la liste
		listIssue.add(issue1);
		listIssue.add(issue2);
		
		Projet projet =projet_issue_Manager.getProjetById(1);
		
		//Affectation 
		
		projet_issue_Manager.assignIssuesProject(listIssue, projet);
		
		
	}

}
