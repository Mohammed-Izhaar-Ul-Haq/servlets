<%@page import="com.vvit.dto.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="5px">
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Age</th>
	<th>Phone</th>
	<th>Delete</th>
	<th>Update</th>
	
	<% ArrayList<Customer> customers = (ArrayList)request.getAttribute("cus"); 
		for(Customer c : customers){
	%>
	
	<tr>
	<td><%= c.getId() %></td>
	<td><%= c.getName()%></td>
	<td><%= c.getEmail() %></td>
	<td><%= c.getAge() %></td>
	<td><%= c.getPhone()%></td>
	<td><a href="delete?id=<%= c.getId()%>">Delete</a></td>
	<td><a href="update?id=<%= c.getId()%>">Update</a></td>
	</tr>
	<%} %>
	</table>
	<h1><a href="register.jsp">ADD</a></h1>
</body>
</html>