package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/First-Servlet")

public class FirstServlet extends HttpServlet {
    protected  void doGet( HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

     response.setContentType("text/html"); // html type document
     PrintWriter out= response.getWriter(); // for writing on web pages, work age pen

     out.println("<html><body>");
     out.println("<h1>Har Har Mahadev</h1>");
     out.println("<h1>Jay Shiv Shankar<h1>");
     out.println("</body></html>");

    }
}
