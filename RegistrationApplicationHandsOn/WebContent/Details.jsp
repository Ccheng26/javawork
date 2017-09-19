<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
<h1>Registration Details</h1>
   <table>
	   <tr>
	   <td>First Name</td>
	   <td><%= session.getAttribute("first")%></td>
	   </tr>
	   <tr>
	   <td>Last Name</td>
	   <td><%= session.getAttribute("last")%></td>
       </tr>
       <tr>
	   <td>User Name</td>
	   <td><%= session.getAttribute("user")%></td>
       </tr>
       <tr>
	   <td>Gender</td>
	   <td><%= session.getAttribute("gender")%></td>
       </tr>
       <tr>
	   <td>Hobbies</td>
	   <td><%= session.getAttribute("hobbies")%></td>
       </tr>
       <tr>
	   <td>Country</td>
	   <td><%= session.getAttribute("country")%></td>
	   </tr>
   </table>
</body>
</html>