package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form-data")
public class FormData extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{

        res.setContentType("text/html");
        PrintWriter out= res.getWriter();

        String name= req.getParameter("name");
        String pass= req.getParameter("pass");
        String email= req.getParameter("email");

        out.println("<h3>"+name+"</h3>");
        out.println("<h3>"+pass+"</h3>");
        out.println("<h3>"+email+"</h3>");

    }

}
