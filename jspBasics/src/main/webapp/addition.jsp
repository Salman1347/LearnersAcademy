<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>addition of two numbers</title>
</head>
<body>
	
	<%
	
		int number1= Integer.parseInt(request.getParameter("number1"));
	
	    int number2= Integer.parseInt(request.getParameter("number2"));
	    
	    int num3=number1+number2;
	    
	    

	%>
	
	<%= num3%>
	
	
</body>
</html>