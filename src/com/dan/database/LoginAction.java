package com.dan.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LoginAction {
	private String user_name;
	private String password;
	private DatabaseInterfaceObject currentUserRow = null;
	ResultSet sqlArray = null;
	

	
	public String execute() {
		try{
		currentUserRow= new DatabaseInterfaceObject();
		sqlArray = currentUserRow.getRow("Login", "USER_NAME", user_name);
		String databaseUserName = sqlArray.getString("USER_NAME");
		String databasePassword = sqlArray.getString("PASSWORD");
		//Checks If user name and Password Entered in Form exist inside database
		if(user_name.equals(databaseUserName)&&password.equals(databasePassword)){
			return "success";
		}
		}catch(Exception e){
			System.out.println("No Such Employee");
		}
			
		
		return "error";
	
//	  
	 }


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;

	}





	public void setPassword(String password) {
		this.password = password;
	}





	

	

	

}
