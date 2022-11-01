<%@page import="com.vvit.dto.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Customer c = (Customer)request.getAttribute("customer"); %>
	<form action="update2">
	ID : <input type="text" name="id" value="<%=c.getId() %>" readonly="readonly"> <br> <br>
	Name : <input type="text" name="name" value="<%=c.getName() %>"> <br> <br>
	Email : <input type="text" name="email" value="<%=c.getEmail() %>"> <br> <br>
	Age : <input type="text" name="age" value="<%=c.getAge() %>"> <br> <br>
	Phone : <input type="text" name="phone" value="<%=c.getPhone() %>"> <br> <br>
	<input type="submit" value="update">
	</form>
</body>
</html>