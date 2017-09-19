package com.mydocs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServlet
 */
@WebServlet("/SuccessServlet")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user= request.getParameter("userName");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("<title>Success</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hello "+user +"</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
