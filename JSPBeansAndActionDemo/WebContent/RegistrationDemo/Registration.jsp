<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="userBean" class="com.catp.beans.Employee" scope="request" /><!-- instantiating bean -->
<jsp:setProperty name="userBean" property="*" /><!-- matches all properties with the names given in input field -->

<% if (request.getParameter("register")!=null){ %>
	<jsp:forward page="Success.jsp"> <%-- forwards to page like with  dispatcher --%>
		<jsp:param value="Registration Successful" name="message" /> <%-- share parameters to reponse page --%>
	</jsp:forward>
<% }%>
	
<body>
<h2 style="font-size: 25px;">Enter Details</h2>

 <form method="POST">
	 <table>
		<tr>
			<td>First Name</td>
			<td><input name="fName" type="text" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input name="lName" type="text" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input name="password" type="password" /></td>
		</tr>
		<tr>
			<td>User Name</td>
			<td><input name="uName" type="text" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input name="gender" type="radio" value="male" />Male</td>
			<td><input name="gender" type="radio" value="fmmale" />Female</td>
		</tr>
		<tr>
			<td>
				<input name="hobbies" type="checkbox" value="dance" /> Dance <br>
				<input name="hobbies" value="music" type="checkbox" /> Music <br>
				<input name="hobbies" value="sports" type="checkbox" /> Sports <br>
				<input name="hobbies" value="painting" type="checkbox" /> Painting <br>
			</td>
		</tr>
		<tr>
			<td>Designation</td>
			<td>
			<select name="designation">
				<option selected="selected">--select--</option>
				<option value="1">Manager</option>
				<option value="2">Trainee</option>
				<option value="3">Developer</option>
			</select>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="Register" name="register" />
			</td>
		</tr>
	 </table>
 </form>	
</body>
</html>