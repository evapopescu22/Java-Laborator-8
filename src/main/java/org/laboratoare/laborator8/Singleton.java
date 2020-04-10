package org.laboratoare.laborator8;
import java.sql.*;

public class Singleton 

{    
	private static Singleton myObj;
	
	 private Singleton(){
         
	    }
	 
	public static void main(String args[]){  
		
		try{  

		Class.forName("oracle.jdbc.driver.OracleDriver");  
		    
		Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:orcl","dba","sql");  
		    
		
	    System.out.println("Conectat");
	    
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		
    
}
