package com.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
////		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		if ("admin".equalsIgnoreCase(userName)&&"admin".equals(password)) {
//			response.sendRedirect("SuccessServlet?user="+userName); //write parameter to url if you put ?
//		} else {
//			PrintWriter out= response.getWriter();
//			out.print("<html><head>");
//			out.print("<title>My Frist Servlet</title>");
//			out.print("</head>");
//			out.print("<body>");
//			out.print("The entered credentials does not match");
//			out.print("</body>");
//			out.print("</html>");
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if ("admin".equalsIgnoreCase(userName)&&"admin".equals(password)) {
			response.sendRedirect("SuccessServlet?user="+userName); //write parameter to url if you put ?
		} else {
			PrintWriter out= response.getWriter();
			out.print("<html><head>");
			out.print("<title>My Frist Servlet</title>");
			out.print("</head>");
			out.print("<body>");
			out.print("The entered credentials does not match");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
