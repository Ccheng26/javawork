<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.home.model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Home owner information</title>
  <link rel="stylesheet" href="./CSS/style.css">
</head>
<body>
<%
Users user = (Users)session.getAttribute("user");
%>
	<div class="container">
		<div class="logintxtsection">
			<img class="stockphoto1" style="width:300px" alt="home" src="http://www.leisepropertyservices.com/wp-content/uploads/2014/12/selling-your-home-cedar-shingle-home11.jpg">
		</div>
		<div class="loginformsection">
			<form action="HomeownerServlet?action=save" method="POST">
				<input type="hidden" name="user_id" value=<%= user.getUserId() %> />
				<input type="hidden" name="location_Id" value=<%= session.getAttribute("locationId").toString() %> />
				<label>First Name<span class="asterisk">*</span></label><br/>
				<input type="text" name="first_name"/><br/>
				<label>Last Name<span class="asterisk">*</span></label><br/>
				<input type="text" name="last_name"/><br/>
				<label>Date of Birth<span class="asterisk">*</span></label><br/>
				<input type="date" name="dob"/><br/>
				<label>Are you retired?<span class="asterisk">*</span></label><br/>
				<input type="radio" name="retired" value="y"> Yes<br>
  				<input type="radio" name="retired" value="n"> No<br>
				<label>Social Security Number<span class="asterisk">*</span></label><br/>
				<input type="number" name="ssn"/><br/>
				<label>Email address<span class="asterisk">*</span></label><br/>
				<input type="email" name="email_id"/><br/>
				<input type="submit" name="submit" value="continue"/><br/>
			</form>
		</div>
	</div>
	
</body>
</html>