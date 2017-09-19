<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    

<div class="header">
<h1 class="headertxt">Homeowner Insurance</h1>
<hr>
<% String username = (String)request.getSession().getAttribute("username"); %>
<!-- potentially pass this array as context -->

<% if(username!=null||username==""){ %>
<nav class="nav"><a href="#">Home</a> | <a href="#">Get Quote</a> | <a href="#">Retrieve Quote</a>| <a href="#">My Policies</a>| <a href="#">Logout</a></nav>
<%}%>
</div>