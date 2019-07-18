package com.finexus.sitecheckengine.engine.mongoConn;


import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DatabaseConnection {
	
	
	private static MongoClient mongoClient;

	public static void main(String args[]) {
		
		try {

			mongoClient = new MongoClient();

			MongoDatabase db = mongoClient.getDatabase("CRUD");
			
			Document course=new Document();
			
			course.append("courseID", "M101P");
			course.append("title", "MongoDB for Developers");
			course.append("startDate", "15 Mar 2016 at 17:00 UTC");
			course.append("endDate", "03 May 2016 at 17:00 UTC");
			course.append("instructor","Andrew Erlichson");
			course.append("aboutCourse", "Learn everything you need to know to get started building a MongoDB-based app");
			
			db.getCollection("courses").insertOne(course);
	
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
			
			
			
			
			
			
			
//			
//			mongoClient = new MongoClient("localhost", 27017);
//			MongoDatabase database = mongoClient.getDatabase("ecom_engine"); //.getDB("ecomengine");
//			
//			
////			boolean auth = database.authenticate("username", "pwd".toCharArray());
//					
//			mongoClient.listDatabaseNames();
//			 
//			
//			
//			
//			
	
			
		
		}// end of main method
	
//	private static List<String> listDatabaseNames() {
//		  List<String> databaseNames = new ArrayList<>();
//		  for (String databaseName : mongoClient.listDatabaseNames()) {
//		    databaseNames.add(databaseName);
//		    System.out.println(databaseName);
//		  }
//		  return databaseNames;
//		}
//}
}