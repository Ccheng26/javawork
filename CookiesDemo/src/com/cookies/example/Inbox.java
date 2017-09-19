package com.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie [] cookieList= request.getCookies();
		String username= null;
		String location=null;
		for(Cookie x:cookieList){ //forEach loop, x is a place holder representing index
			if(x.getName().equals("username")){
				//found key, set to user variable we've declared
				username= x.getValue();
			} else if(x.getName().equals("location")) {
				location= x.getValue();
			}

		}
		PrintWriter out = response.getWriter();
		out.print("<body><h4>"+username+"</h4></body>");
		out.print("<a href='SentItems'>Sent Items</a>");
		out.print("</body>");
	}

}
