<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>


<%! 
	//declaration tag for count variable
	int count =0;
	//method to increment counter
	void incrementCount(){
		count++;
	}
%>
<body>
<h1 style="margin-left: 25%;">Sample Page</h1>
<h2>
<%
	//scriptlet tag for incrementing counter
	int localVariable=0;
	out.print("This page is viewed "+count+ " times");
	incrementCount();
%>
The variable of the local variable is
<%=localVariable %>
<!-- print value using expression tag -->
<% localVariable++; %>
<!-- increments local variable -->
</h2>

</body>
</html>