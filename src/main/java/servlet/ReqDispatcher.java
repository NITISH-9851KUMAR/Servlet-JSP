package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/request-dispatcher")
public class ReqDispatcher extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String term = request.getParameter("condition");


        if (term == null) {
            out.println("We have not accepted terms and condition");

            // Request Dispatcher Object include method
            RequestDispatcher rd= request.getRequestDispatcher("request-disp.html");
            rd.include(request, response);

        } else {
            // Request Dispatcher Object Forward Method
            RequestDispatcher rd= request.getRequestDispatcher("request-disp-include.html");
            rd.forward(request, response);

        }

    }
}
