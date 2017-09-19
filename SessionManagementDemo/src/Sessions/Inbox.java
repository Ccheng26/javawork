package Sessions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("user");
		String location=request.getParameter("location");
		HttpSession session= request.getSession();
		if(session.getAttribute("user")== null) {//or  session.getAttribute("user")!= null to inbox
			response.sendRedirect("login.html");
		} else {
			userName=session.getAttribute("user").toString(); //REMEMBER TO TYPE CAST TO STRING
			location=session.getAttribute("location").toString();
		}
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>Inbox</title></head><body>");
		out.print("<h1 style='margin-left:40%'>Inbox</h1>");
		out.print("<h2>Welcome"+userName+"</h2>");
		out.print("<h2>Location"+location+"</h2>");
		out.print("<a href='SentItems' /> Sent Items</a>");
		out.print("</body></html>");
	}

}
