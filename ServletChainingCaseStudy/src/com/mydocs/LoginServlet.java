package com.mydocs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		
		if("admin".equalsIgnoreCase(userName) && "admin".equals(password)) {
//			RequestDispatcher dispatcher= request.getRequestDispatcher("SuccessServlet");
//			dispatcher.forward(request,response);
			response.sendRedirect("SuccessServlet?userName=admin");
		}else {
			response.sendRedirect("ErrorServlet");
		}
	}

}
