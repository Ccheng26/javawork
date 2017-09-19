package com.netbazaar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexPage
 */
@WebServlet("/IndexPage")
public class IndexPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><style>h1{text-align:center;}</style></head><body>");
		out.print("<h1>Net Bazaar</h1>");
		out.print("<a href='MobilesServlet'>Mobiles</a><br>");
		out.print("<a href='LaptopServlet'>Laptops</a><br>");
		out.print("<a href='WatchServlet'>Watches</a><br>");
	}

}
