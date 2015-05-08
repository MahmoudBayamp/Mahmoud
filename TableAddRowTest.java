package com.bayamp.tests;



//STEP 1. Import required packages
import java.sql.*;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TableAddRowTest {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
 static final String DB_URL = "jdbc:mysql://192.168.1.77:3306/shopping_cart";

 //  Database credentials
 static final String USER = "root";
 static final String PASS = "mysql";
 
 
 @Test
 public static void testAddedRow(String userID) {
 Connection conn = null;
 Statement stmt = null;
 try{
    //STEP 2: Register JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    //STEP 3: Open a connection
    System.out.println("Connecting to database...");
    conn = DriverManager.getConnection(DB_URL,USER,PASS);

    //STEP 4: Execute a query
    System.out.println("Creating statement...");
    stmt = conn.createStatement();
    String sql;
    
    sql = "SELECT * FROM user WHERE userid = \"Mike1\" ";
    ResultSet rs = stmt.executeQuery(sql);
    if(rs.isFirst()){
    	Reporter.log("User was added");
    	sql = "delete from user where userid = \"Mike1\" ";
    	stmt.execute(sql);
    	}
    else
    	Reporter.log("User was not added");
    
    
    sql = "SELECT id, firstname, lastname FROM user";
    rs = stmt.executeQuery(sql);

    //STEP 5: Extract data from result set
    while(rs.next()){
       //Retrieve by column name
       int id  = rs.getInt("id");
       String first = rs.getString("firstname");
       String last = rs.getString("lastname");

       //Display values
       System.out.print(id);
       System.out.print(", " + first);
       System.out.println(", " + last);
    }
    //STEP 6: Clean-up environment
    rs.close();
    stmt.close();
    conn.close();
 }catch(SQLException se){
    //Handle errors for JDBC
    se.printStackTrace();
 }catch(Exception e){
    //Handle errors for Class.forName
    e.printStackTrace();
 }finally{
    //finally block used to close resources
    try{
       if(stmt!=null)
          stmt.close();
    }catch(SQLException se2){
    }// nothing we can do
    try{
       if(conn!=null)
          conn.close();
    }catch(SQLException se){
       se.printStackTrace();
    }//end finally try
 }//end try
 System.out.println("Goodbye!");
}//end main
}//end FirstExample