package com.myfriends;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfileServlet
 */
//@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String user= session.getAttribute("user").toString();
		PrintWriter out=response.getWriter();
		out.print("<html><head><style>.profile_bx{margin-left:auto;margin-right:auto; background-color: #6495ED; width:66%; height:50%; }</style></head><body>");
		out.print("<p><b>Welcome Arun</b></p>");
		out.print("<a href='HomeServlet'/>Home</a>");
		out.print("<div class='profile_bx'><p>Name: Arun</p><p>I am smart and Energetic ...Friendly and cool</p><p>Education:B-Tech</p></div>");
	}

}
