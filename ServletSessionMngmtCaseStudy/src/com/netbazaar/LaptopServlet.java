package com.netbazaar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LaptopServlet
 */
@WebServlet("/LaptopServlet")
public class LaptopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><style>h1{text-align:center;}</style></head><body>");
		out.print("<h1>Net Bazaar</h1>");
		out.print("<h2>Laptops</h2>");
		out.print("<a href='IndexPage'>Home</a>  <a href='CartServlet'>Cart Page</a>");		
		out.print("<form method='POST' action='CartServlet'>"+
		"<input type='checkbox' name='apple' value=15000 /><label for='apple'>Apple Price 15000</label><br>"+
		"<input type='checkbox' name='hp' value=10000 /><label for='hp'>HP Price 10000</label><br>"+
		"<input type='checkbox' name='dell' value=5000 /><label for='dell'>Dell Price 5000</label><br>"+
		"<input type='submit' name='Add to Cart' />"+
		"</form>");
	
	}

}
