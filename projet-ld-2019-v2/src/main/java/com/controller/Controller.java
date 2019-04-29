package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Jury;
import com.model.Sujet;
import com.dao.*;

@RestController
//@RequestMapping("/path")  //Permet de rajouter des éléments dans le path 
public class Controller {
		@RequestMapping(value="/testgetallsujets", method=RequestMethod.GET)
		@ResponseBody
		public List<Sujet> getSujets(@RequestParam(required = true, value="identifiantUser") String identifiantUser) throws Exception {
			SujetDao SujetDao = new SujetDao(); 
			List<Sujet> listeSujets = new ArrayList<Sujet>(); 
			SujetDao.connectBDD();
			if(SujetDao.checkUserConnected(identifiantUser)) {
				listeSujets = SujetDao.selectAll();
			}
			System.out.println(listeSujets);
			return listeSujets; 
		}
		
		@RequestMapping(value="/testgetASubject", method=RequestMethod.GET)
		@ResponseBody
		public List<String> getASubject(@RequestParam(required = true, value="identifiantSujet") String identifiantSujet, @RequestParam(required=true, value="identifiantUser") String identifiantUser) throws SQLException {
			SujetDao SujetDao = new SujetDao(); 
			List<String> listeInformations = new ArrayList<String>(); 
			SujetDao.connectBDD();
			if(SujetDao.checkUserConnected(identifiantUser)) {
				listeInformations = SujetDao.selectASubject(identifiantSujet, identifiantUser);
			}
			System.out.println(listeInformations);
			return listeInformations; 
		}
		
		@RequestMapping(value = "/testgetalljurys", method = RequestMethod.GET)
		@ResponseBody
		public List<Jury> getJurys(@RequestParam(required = true, value = "identifiantUser") String identifiantUser) throws SQLException {
			JuryDao JuryDAO = new JuryDao();
			List<Jury> listeJurys = new ArrayList<Jury>();
			JuryDAO.connectBDD();
			if (JuryDAO.checkUserConnected(identifiantUser)) {
				listeJurys = JuryDAO.selectAll();
			}
			System.out.println(listeJurys);
			return listeJurys;
		}

		
}