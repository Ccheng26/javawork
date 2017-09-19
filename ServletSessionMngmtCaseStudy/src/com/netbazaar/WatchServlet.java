package com.netbazaar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WatchServlet
 */
@WebServlet("/WatchServlet")
public class WatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><style>h1{text-align:center;}</style></head><body>");
		out.print("<h1>Net Bazaar</h1>");
		out.print("<h2>Watches</h2>");
		out.print("<a href='IndexPage'>Home</a>  <a href='CartServlet'>Cart Page</a>");
		out.print("<form method='POST' action='CartServlet'>"+
		"<input type='checkbox' name='rolex' value=25000 /><label for='rolex'>Rolex Price 25000</label><br>"+
		"<input type='checkbox' name='citizen' value=20000 /><label for='citizen'>Citizen Price 20000</label><br>"+
		"<input type='checkbox' name='titan' value=15000 /><label for='titan'>Titan Price 15000</label><br>"+
		"<input type='submit' name='Add to Cart' />"+
		"</form>");
	}

}
