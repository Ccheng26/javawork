package com.chainingexample;

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
 * Servlet implementation class UserHome
 */
@WebServlet("/UserHome")
public class UserHome extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("<title>User Home</title><body>");
		RequestDispatcher dispatcher= request.getRequestDispatcher("WelcomeMessage");// get request from Welcome Message
		request.setAttribute("username", "Jerry"); //setting attribute for request
		dispatcher.include(request, response);//forward request to welcome message
		out.print("<h2 Style= 'color:green;margin-left:50%;margin-top:20%'>This is the User home</h2>");
		dispatcher= request.getRequestDispatcher("Footer");
		dispatcher.include(request,response);
		out.print("</body></html>");
	}

}
