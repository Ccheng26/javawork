package com.myfriends;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.PrintWriter;

//@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String user=null;
		user = session.getAttribute("user").toString();
		if(user!=null) {
			PrintWriter out= response.getWriter();
			out.print("<html><head></head><body>");
			out.print("<p><b>Welcome Arun</b></p>");
			out.print("<a href='ProfileServlet'/>Profile</a>");
			out.print("</body></html>");
		}else {
			HttpServletResponse resp = (HttpServletResponse) response;
			resp.sendRedirect("Login.html");
		}
	}
}
