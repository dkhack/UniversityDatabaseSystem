package javaDB;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        getConnection();
        
        }
    
    
    
    public static  void getConnection()
    {
    	String connectionURL= "jdbc:sqlserver://localhost:1433; databaseName = finalDB; user =testUser; password = 123";
    	Connection connection=null;
    	Statement statement= null;
    	// ResultSet resultSet=null;
    	try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        connection=DriverManager.getConnection(connectionURL);
        System.out.println("Connection Successful");

         String sql;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a SQL Command");
         sql=scanner.nextLine();
         
        statement = connection.createStatement();
         
      int numOfRowsAffected=  statement.executeUpdate(sql);
      
   
    	System.out.println("Operation Complete \n"+numOfRowsAffected + " Rows Affected" );
    	} catch(Exception exception){
        exception.printStackTrace();

	
}
}
}





    

