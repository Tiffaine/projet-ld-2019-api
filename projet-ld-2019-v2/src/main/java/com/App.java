package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controller.Controller;
//TestCommitv2
@SpringBootApplication
@ComponentScan(basePackageClasses=Controller.class)
public class App 
{
    public static void main( String[] args )
    {
        try {
        	SpringApplication.run(App.class, args);
        	System.out.println("Application démarrée");
        	
        } catch (Exception e) {
        	System.out.println("Erreur application !");
        }
    }
}
