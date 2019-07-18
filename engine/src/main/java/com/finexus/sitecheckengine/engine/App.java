package com.finexus.sitecheckengine.engine;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.finexus.sitecheckengine.engine.repositories;

import com.finexus.sitecheckengine.engine.pojo.Customer;
import com.finexus.sitecheckengine.engine.repositories.CustomerRepository;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;



/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App    // implements CommandLineRunner
{

	@Autowired
	private CustomerRepository repository; //CustomerRepository repository;
	
	private static MongoClient mongoClient;
	
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);    	
    }
    
    
	/*
	 * try {
	 * 
	 * 
	 * mongoClient = new MongoClient();
	 * 
	 * MongoDatabase db = mongoClient.getDatabase("CustomerDb");
	 * 
	 * Document customer=new Document();
	 * 
	 * customer.append("courseID", "M101P"); customer.append("title",
	 * "MongoDB for Developers"); customer.append("startDate",
	 * "15 Mar 2016 at 17:00 UTC"); customer.append("endDate",
	 * "03 May 2016 at 17:00 UTC");
	 * customer.append("instructor","Andrew Erlichson");
	 * customer.append("aboutCourse",
	 * "Learn everything you need to know to get started building a MongoDB-based app"
	 * );
	 * 
	 * db.getCollection("customer").insertOne(customer);
	 * 
	 * 
	 * 
	 * }catch (Exception e) { e.printStackTrace(); }
	 */
    
    
    
    
    /*
    public void run(String... args) throws Exception {

    	
		
		 * repository.deleteAll();
		 * 
		 * // save a couple of customers repository.save(new Customer("Alice",
		 * "Smith")); repository.save(new Customer("Bob", "Smith"));
		 * 
		 * // fetch all customers System.out.println("Customers found with findAll():");
		 * System.out.println("-------------------------------"); for (Customer customer
		 * : repository.findAll()) { System.out.println(customer); }
		 * System.out.println();
		 * 
		 * // fetch an individual customer
		 * System.out.println("Customer found with findByFirstName('Alice'):");
		 * System.out.println("--------------------------------");
		 * System.out.println(repository.findByFirstName("Alice"));
		 * 
		 * System.out.println("Customers found with findByLastName('Smith'):");
		 * System.out.println("--------------------------------"); for (Customer
		 * customer : repository.findByLastName("Smith")) {
		 * System.out.println(customer); }
		
	
    	
    }
     */
    
    
    	
}
