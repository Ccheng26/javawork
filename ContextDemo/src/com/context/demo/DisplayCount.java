package com.context.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayCount
 */
@WebServlet("/DisplayCount")
public class DisplayCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ServletContext context;

	public void init(ServletConfig config) throws ServletException {
		 context= config.getServletContext();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String count = context.getAttribute("count").toString();
		out.print("<body> The count value is "+ count);
		out.print("</body>");
		context.removeAttribute("count");
	}

}
