<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div id="header" style="background-color:blue; height:20%;">
        <%@include file ="header.html"%>
    </div>
    <div id="content" style="background-color:grey; height:70%;text-align:center;">
        <br/>
        <form method="GET" action="greetings.jsp">
        Enter Your Name <input type="text" name="name"/><br/>
            <input type="submit"/>
        </form>
    </div>
    <div style="height:8%; bottom:0; position:relative;">
        <%@include file ="footer.html"%>
    </div>
</body>
</html>