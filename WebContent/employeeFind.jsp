<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome, login successful

	<h1>Query Database for Employee</h1>
	<form action="findEmployee" method="post">
		<s:textfield label="Employee Id Number" name="employeeId" /><br>
		<s:submit label = "submit"></s:submit>
	</form>
	
	<p> only 2 employees in database. id= 1 or 2</p>
	


</body>
</html>