<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String first= request.getParameter("firstname");
String last= request.getParameter("lastname");
String password= request.getParameter("password");
String user= request.getParameter("username");
String gender= request.getParameter("gender");
String country= request.getParameter("country");
String checkboxValues= request.getParameter("hobbies");
String hobbies[]= request.getParameterValues("hobbies");

%>


String message=null;
if (request.getParameter("Register")!=null){
	if ("".equals(first)||first==null){	
		message="First Name cannot be null.";
		response.sendRedirect("Registration.jsp?message="+message);
	} else if("".equals(last)||last==null){
		message="Last Name cannot be null";
		response.sendRedirect("Registration.jsp?message="+message);
	} else if("".equals(user)||user==null){	
		message="User Name cannot be null";
		response.sendRedirect("Registration.jsp?message="+message);
	} else if("".equals(gender)||gender==null){	
		message="Gender cannot be null";
		response.sendRedirect("Registration.jsp?message="+message);
	} else if("".equals(country)||country==null){	
		message="Country cannot be null";
		response.sendRedirect("Registration.jsp?message="+message);
	} else  {
		session.setAttribute("first", first);
		session.setAttribute("last", last);
		session.setAttribute("user", user);
		session.setAttribute("gender", gender);
		session.setAttribute("country", country);
		
		response.sendRedirect("Details.jsp");
	}
}  
%>


<body>
<%-- message= request.getParameter("message");
if(message != null){
	
--%>
<p><%--= message --%></p>
<%--}  --%>

 <form method="GET">
        First Name <input name="firstname" type="text" /><br>
        Last Name <input name="lastname" type="text" /><br>
        Password <input name="password" type="password" /><br>
        User Name <input name="username" type="username" /><br>
        Gender <input name="gender" type="radio" value="male" /> Male<br>
        <input name="gender" type="radio" value="female" />Female<br>
        Hobbies <input name="hobbies" type="checkbox" value="Dance" /> Dance <input name="hobbies" value="Music" type="checkbox" /> Music <br>
        <input name="hobbies" value="Sports" type="checkbox" /> Sports <input name="hobbies" value="Painting" type="checkbox" /> Music <br>
        Country <select name="country">
                <option value="india">India</option>
                <option value="usa">USA</option>
              </select>
        <input type="submit" name="Register"/>
	</form>
	
</body>
</html>