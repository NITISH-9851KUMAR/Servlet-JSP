/** A GenericServlet is Abstract class which has more method but one is abstract method "service"
 * a program must override this method if they inherit this Abstract class. */

package BasicsServlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class GenericServletClass extends GenericServlet{

	public void service(ServletRequest req, ServletResponse res)
		throws ServletException, IOException{

		res.setContentType("text/html");
		PrintWriter out= res.getWriter();

		out.println("<h1>Generic Servlet</h1>");
		
	}

}
