<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel="stylesheet" href="./CSS/style.css">
</head>
<body>
    <div class="container">
    <h3 class="userdetail">User Details</h3>
    <p class="registernote">Note: Password must be 8 characters with numbers and characters only.</p>
    <form action="UserServlet?action=register" method="POST">
        <label>User id</label>
        <input type="text" name="username"/><br>
        <label>Password</label>
        <input type="password" name="password"/><br>
        <label>Re-enter password</label>
        <input type="password" name="password"/><br>
        <input type="submit" name="submit" value="Register"/>
    </form>
    </div>
    <!-- alert in java javax.swing.JOptionPane.showMessageDialog(null, "");-->
</body>
</html>