package session_tracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hidden-field")
public class HiddenFiled extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user_name= request.getParameter("user_name");
        String password= request.getParameter("password");

        out.println("<h3>User Name: "+user_name+"</h3>");
        out.println("<h3>Password: "+password+"</h3>");

    }
}
