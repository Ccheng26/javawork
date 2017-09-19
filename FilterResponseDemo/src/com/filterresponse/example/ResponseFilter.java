package com.filterresponse.example;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ResponseFIlter
 */
// @WebFilter("/ResponseFIlter")
public class ResponseFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse resp= (HttpServletResponse) response;
		PrintWriter out = resp.getWriter();
		out.print("<html><head></head>");
		out.print("<body>");
		out.print("<h1>Printed by the Response Filter</h1>");
		chain.doFilter(request, response);
		out.print("<h1>This is also printed by the response Filter</h1>");
		out.print("</body></html>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
