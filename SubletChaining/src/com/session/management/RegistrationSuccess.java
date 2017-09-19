package com.session.management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationSuccess
 */
@WebServlet("/RegistrationSuccess")
public class RegistrationSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		String first_name= request.getParameter("first_name");
		String last_name= request.getParameter("last_name");
		String user_name= request.getParameter("user_name");
		String college= request.getParameter("college");
		String degree= request.getParameter("degree");
		out.print("<span>first: "+first_name+"</span>");
		out.print("<p>last: "+last_name+"</p>");
		out.print("<h6>username: "+user_name+"</h6>");
		out.print("<div>college: "+college+"</div>");
		out.print("<nav>degree: "+degree+"</nav>");
	}

}
