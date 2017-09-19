<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.home.model.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel="stylesheet" href="./CSS/style.css">
</head>

<%--
if(request.getParameter("login")!=null){
	Users user= new Users();
	user.setUserid(request.getParameter("username"));
	user.setPassword(request.getParameter("password"));
	
	//run sql query to check
	if("?".equals(user.getUserid()) && "?".equalsIgnoreCase(user.getPassword())){
		RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
		//login?action=ExistingUser
		request.setAttribute("user", user);
		dispatcher.forward(request,response);
	} else{
		out.print("Please enter valid ID or username");
	}
}
--%>


<body>
	<%@include file='header.jsp'%>
	<div class= "container">
		<div class="logintxtsection">
		<p class="logintxt">Home insurance, also commonly called hazard insurance or homeowner's insurance is a type of property insurance that covers a private residence, such as a condominium or renters' insurance or home or multiple unit buildings.</p>
		<p class="logintxt">It is an insurance policy that combines various personal insurance protections, which can include losses occuring to one's home, its contents, loss of use (additional living expenses), or loss of other personal possessions of the homeowner as well as liability insurance for accidents that may happen at the home or at the hands of the homeowner within the policy territory. If a home does not meet the underwriting guidlines of a standard homeowners policy the residence could qualify for a limited coverage dwelling policy.</p>
		</div>
		<div class="loginformsection">
			<div class="stockphoto1">
			</div>
		<form action="UserServlet?action=login" method="post">
			<label>User id</label>
			<input type="text" name="username"/><br>
			<label>Password</label>
			<input type="password" name="password"/><br>
			<input type="submit" name="Login" value="Login"/>
		</form>
		New User? <a href="newUser.jsp">Register here</a>
		</div>
	</div>
	
	<%@include file='footer.html'%>
</body>
</html>