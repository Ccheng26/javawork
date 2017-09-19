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
 * Servlet implementation class ConfigDemo
 */
@WebServlet(
		description = "Administrator email as starter.", 
		urlPatterns = { "/ConfigDemo" }, 
		initParams = { 
				@WebInitParam(name = "adminEmail", value = "admin@cognizant.com")
		})
public class ConfigDemo extends HttpServlet {
	private String adminEmail;
	private static final long serialVersionUID = 1L;
    
	public void init(ServletConfig config) throws ServletException{
    	adminEmail= config.getInitParameter("adminEmail");
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><head>");
		out.print("<title>Config Demo</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>The Admin Email is "+ adminEmail+"</h1>");
		out.print("</body>");
		out.print("</head>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
