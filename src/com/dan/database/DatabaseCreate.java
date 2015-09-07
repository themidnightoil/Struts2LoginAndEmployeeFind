//package com.dan.database;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class DatabaseCreate {
//	public static void main(String args[]) throws SQLException{
//		DatabaseInterfaceObject obj = new DatabaseInterfaceObject();
//		obj.createTestTables();
//		obj.create_test_data_for_tables();
//		ResultSet sqlArray =  obj.getRow("Login", "USER_NAME", "Danny");
//		ResultSet sqlArray2 = obj.getRow("Employee", "NAME", "John");
//
//		String user_name  =sqlArray.getString("USER_NAME");
//		String password =sqlArray.getString("PASSWORD");
//		String name = sqlArray2.getString("NAME");
//		String address = sqlArray2.getString("ADDRESS");
//		
//		System.out.println("USERNAME: "+user_name+" PASSWORD: "+password);
//		System.out.println("EMPLOYEE: "+name+" ADDRESS: "+address);
//
//		
//		
//		
//		
//	}
//
//}
