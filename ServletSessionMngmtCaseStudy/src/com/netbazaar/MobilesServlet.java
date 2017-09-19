package com.netbazaar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MobilesServlet
 */
@WebServlet("/MobilesServlet")
public class MobilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><style>h1{text-align:center;}</style></head><body>");
		out.print("<h1>Net Bazaar</h1>");
		out.print("<h2>Mobiles</h2>");
		out.print("<a href='IndexPage'>Home</a>  <a href='CartServlet'>Cart Page</a>");
		out.print("<form method='POST' action='CartServlet'>"+
		"<input type='checkbox' name='samsung' value=25000 /><label for='samsung'>Samsung 25000</label><br>"+
		"<input type='checkbox' name='nokia' value=15000 /><label for='nokia'>Nokia Price 15000</label><br>"+
		"<input type='checkbox' name='lg' value=5000 /><label for='lg'>LG Price 5000</label><br>"+
		"<input type='submit' name='Add to Cart' />"+
		"</form>");
	}
}
