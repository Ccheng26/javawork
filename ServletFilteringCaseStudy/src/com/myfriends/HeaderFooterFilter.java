package com.myfriends;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class HeaderFooterFilter
 */
//@WebFilter("/HeaderFooterFilter")
public class HeaderFooterFilter implements Filter {

	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		out.print("<html><head><style>h1{text-align:center; background-color:#808000} h4{text-align:center; background-color:#808080; bottom: 0; right:0; left:0; position:absolute; margin: 10px}</style></head><body>");
		out.print("<h1>My Friends<br><br></h1>");
		chain.doFilter(request, response);
		out.print("<footer><h4>CopyRight 2010-2012 <br><br> Rights Reserved XYZ Corporation</h4></footer></body></html>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
