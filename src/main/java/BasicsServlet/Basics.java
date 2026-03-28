package BasicsServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Basics extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        PrintWriter out= response.getWriter();
        response.setContentType("text/html");
        out.println("<h5><a> Basics HttpServlet </a> </h5>");
        out.println("<h5><a> Commonly used Servlet </h5></a>");
        out.close();
    }
}


