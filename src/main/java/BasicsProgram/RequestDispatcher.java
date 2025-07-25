package BasicsProgram;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet("/request-dispatcher")
public class RequestDispatcher extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        String email = request.getParameter("email");
        String term = request.getParameter("condition");


        if (term == null) {
            out.println("We have not accepted terms and condition");

            // Request Dispatcher Object include method
            javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("request-disp.html");
            rd.include(request, response);

        } else {
            out.println("<h3>" + name + "</h3>");
            out.println("<h3>" + pass + "</h3>");
            out.println("<h3>" + email + "</h3>");

            // Request Dispatcher Object Forward Method
            javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("request-disp-include.html");
            rd.forward(request, response);

        }

    }
}
