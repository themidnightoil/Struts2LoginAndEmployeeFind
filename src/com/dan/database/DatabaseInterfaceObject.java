 	package com.dan.database;

import java.sql.*;

public class DatabaseInterfaceObject {
	 Connection connection = null;
	 Statement statement = null;
	
	DatabaseInterfaceObject(){
		try{
			Class.forName("org.sqlite.JDBC");
			connection = (Connection) DriverManager.getConnection("jdbc:sqlite:test.db");
		}catch(Exception e){
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
		System.out.println("Opened database successfully");
		
	}
	
	public ResultSet getRow(String tableName , String colName ,String hasValue){
		ResultSet rSet = null;
		try {
			String query = String.format( "select * FROM %s WHERE %s = '%s'",tableName,colName,hasValue);
			System.out.println(query);
			statement = connection.createStatement();
			rSet = statement.executeQuery(query);
		

		}catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			
		}
		return rSet;
	}	
	
	public void createTestTables() throws SQLException {
		statement = connection.createStatement();

		String loginTable = 	" CREATE TABLE LOGIN("+
		                    	" ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
		                    	" USER_NAME TEXT NOT NULL,"+
		                    	" PASSWORD  TEXT NOT NULL);";
		String EmployeeTable = 	" CREATE TABLE EMPLOYEE("+
        					   	" ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
        					   	" NAME     TEXT NOT NULL,"+
        					   	" ADDRESS  TEXT NOT NULL);";
		
		 
		 try {
			 
			 
			 statement.executeUpdate(loginTable);
			 statement.executeUpdate(EmployeeTable);
			 
		 
		 } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
		
		
	}
	
	public void create_test_data_for_tables(){	
		try{
			
			statement = connection.createStatement();
			//Clear the Login and Employee table
			statement.executeUpdate("DELETE FROM Login ");
			statement.executeUpdate("DELETE FROM Employee ");
			
			//Test data for the login table
			String sql = (
					"INSERT INTO Login (USER_NAME, PASSWORD)"+
					"VALUES ('Fredrick','Kumar');");
					statement.execute(sql);	
			sql = (
					"INSERT INTO Login (USER_NAME, PASSWORD)"+
					"VALUES ('Danny','Shum');");
					statement.execute(sql);

			sql = (
					"INSERT INTO Employee (NAME, ADDRESS)"+
					"VALUES ('John','MY MADE UP ADDRESS 123');");
					statement.execute(sql);
			sql = (
					"INSERT INTO Employee (NAME, ADDRESS)"+
					"VALUES ('Joe','MY MADE UP ADDRESS 123');");
					statement.execute(sql);
			//Test data for the Employee table
			
		
		}catch(Exception e){
			 System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		     System.exit(0);
			
		}
		System.out.println("Table populated successfully with test data");
	}
	
}


