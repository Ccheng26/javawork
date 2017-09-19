package com.cognizant.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShareHome
 */
@WebServlet(
		urlPatterns = { "/ShareHome" })
public class ShareHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletContext context;
	public void init(ServletConfig config) throws ServletException {
		 context= config.getServletContext();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String adminEmailId = context.getAttribute("adminEmailId").toString();
		out.print("<body> The email id is "+ adminEmailId);
		out.print("</body>");
		context.removeAttribute("adminEmailId");
	}

}
