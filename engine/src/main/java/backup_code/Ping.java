package backup_code;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.SpringApplication;

import com.finexus.sitecheckengine.engine.App;

public class Ping {
	
	 public static void main( String[] args )
	    {
	    	SpringApplication.run(App.class, args);    	
	    
	  String[] hostList = { "http://yahoo.com", "http://www.ebay.com",
	  "https://google.com", "http://www.example.co", "https://paypal.com",
	  "http://bing.com/", "http://techcrunch.com/", "http://mashable.com/",
	  "http://wordpress.org/", "http://example.com/", "http://sjsu.edu/",
	  "https://ebay.co.uk/", "http://google.com.pk/", "http://wikipedia.org/" };
	  
	  for (int i = 0; i < hostList.length; i++) {
	  
	  String url = hostList[i];
	  
	  try { 
		  getStatus(url); 
		  } catch (IOException e) { 
			  e.printStackTrace(); 
			  } 
	  	}
	  
	  System.out.println("Task completed...");
	  }// end of main method
	  
	  public static String getStatus(String url) throws IOException {
	  
	  String result = ""; 
	  int code = 200; int sizeOfWebPage; 
	  //int connectTime; 
	  try { 
		  URL siteURL = new URL(url); HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
	  
	  // connection.setRequestMethod("GET"); 
	  // connection.setRequestMethod("GET");
	  // connection.setRequestMethod("TRACE"); 
	  // connection.setRequestMethod("HEAD"); 
	  connection.setRequestMethod("GET"); 
	  //connection.setRequestMethod("POST");
	  
	  connection.setConnectTimeout(3000); connection.connect();
	  
	  // Here we are getting the size of a web page. 
	  //the content length of the resource that this connection's URL references, 
	  //-1 if the content length is not known, or 
	  //if the content length is greater than Integer.MAX_VALUE
	  
	  sizeOfWebPage = connection.getContentLength();
	  
	  code = connection.getResponseCode();
	  
	  
	  if (code == 200) { 
		  result = "-> Green <-\t" + "Code: " + code +
	  " \t Size of web page: " + sizeOfWebPage ; //+" Connect Time: " +  connectTime; 
	  } else { 
		  result = "-> Yellow <-\t" + "Code: " + code + "\t Size of web page: " + sizeOfWebPage;
		  } 
	  } catch (Exception e) { 
		  result =  "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();	  
	  } System.out.println(url + "\t\tStatus:" + result); 
	  return result; 
	  }
}// end of Ping class

