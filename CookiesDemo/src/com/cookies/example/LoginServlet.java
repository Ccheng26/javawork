package com.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username= request.getParameter("username");
		 String password= request.getParameter("password");
		 String location= request.getParameter("location");
		 if("ahmed".equals(username) && "pass".equalsIgnoreCase(password)){
			Cookie cookie1= new Cookie("username",username);
		 	response.addCookie(cookie1);
			response.sendRedirect("Inbox");
		 } else {
			 PrintWriter out= response.getWriter();
			 RequestDispatcher dispatcher= request.getRequestDispatcher("login.html");
			 out.print("<body><h3>Invalid</h3>");
			 dispatcher.include(request, response);
			 out.print("</body>");
		 }
	}

}
