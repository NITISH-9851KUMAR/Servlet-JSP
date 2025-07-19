/** There are total Three class which is generally used in JSP Program
 * Servlet Interface
 * GenericServlet Class
 * HttpServlet Class
 * But HttpServlet class is frequently used in JSP program due to HTTP-based web apps
 * HttpServlet has more method but some commonly method that is frequently used in Program
 * void doGet(HttpServletRequest request, HttpServletResponse response)
 * void doPost(HttpServletRequest request, HttpServletResponse response)
 * */
package BasicsServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;


public class HttpServletClass extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();

		out.println("<h1> Http Servlet</h1>");

	}

}

