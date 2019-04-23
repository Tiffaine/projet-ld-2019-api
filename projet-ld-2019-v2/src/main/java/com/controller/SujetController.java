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

import com.model.Sujet;
import com.dao.*;

@RestController
//@RequestMapping("/path")  //Permet de rajouter des éléments dans le path 
public class SujetController {
		@RequestMapping(value="/testget", method=RequestMethod.GET)
		@ResponseBody
		public List<Sujet> get(@RequestParam(required = false, value="value") String value) throws SQLException {
			SujetDao SujetDao = new SujetDao(); 
			List<Sujet> listeSujets = new ArrayList<Sujet>(); 
			listeSujets = SujetDao.selectAll();
			System.out.println(listeSujets);
			return listeSujets; 
		}

		
}
