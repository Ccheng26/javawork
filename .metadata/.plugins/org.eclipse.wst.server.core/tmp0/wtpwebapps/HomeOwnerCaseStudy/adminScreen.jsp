<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="./CSS/style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Started JSP</title>
</head>
<body>
    <div class="formcontainer">
        <div class="leftpicture">
            <img class="stockphoto1" style="width:300px" alt="home" src="http://www.leisepropertyservices.com/wp-content/uploads/2014/12/selling-your-home-cedar-shingle-home11.jpg">
        </div>
        <div class="loginformsection">
        
    <form method="post"> 
        
            <h1> Admin Screen </h1>
            <label>Search</label><br>
            <input type="text" name="Search" /><br>
            <input type="submit" name="Search" value="Search"/><br>
        
    </form>   
        
        </div>
    </div>
<%@include file='footer.html'%>
</body>
</html>