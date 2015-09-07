package com.dan.database;

import java.sql.ResultSet;

public class FindEmployeeAction {
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private DatabaseInterfaceObject employeeRow = null;
	ResultSet sqlArray = null;

	
	public String execute() {
		employeeRow= new DatabaseInterfaceObject();
		try{
			sqlArray = employeeRow.getRow("Employee", "ID", employeeId);
		
			String databaseEmployeeID = sqlArray.getString("ID");
			employeeName 			  = sqlArray.getString("NAME");
			employeeAddress 		  = sqlArray.getString("ADDRESS");
		

			return "success";
		
		}catch(Exception e){
			System.out.println("NO SUCH EMPLOYEE ID");
			return "error";
		}
		
	}
	
	
	
	// getter and setters 
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		
		return employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	
	
	
}
