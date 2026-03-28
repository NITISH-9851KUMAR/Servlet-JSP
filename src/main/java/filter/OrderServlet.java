package filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/order-servlet")
public class OrderServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        System.out.println("Order Servlet Execution");

        out.println("<p>Welcome to Order Servlet</p>");
        out.println("<p>This is Order Servlet</p>");

    }

}
