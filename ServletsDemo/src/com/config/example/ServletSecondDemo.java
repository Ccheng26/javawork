package com.config.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSecondDemo
 */
@WebServlet(
		description = "User first and last name", 
		urlPatterns = { "/ServletSecondDemo" }, 
		initParams = { 
				@WebInitParam(name = "firstName", value = "Connie", description = "User first name"), 
				@WebInitParam(name = "lastName", value = "Cheng", description = "User last name")
		})
public class ServletSecondDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private String firstName, lastName;

	public void init(ServletConfig config) throws ServletException{
    	firstName= config.getInitParameter("firstName");
    	lastName= config.getInitParameter("lastName");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		out.print("<html><head>");
		out.print("<title>Config Demo</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>The owner of this application is "+ firstName+ " " + lastName +"</h1>");
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
