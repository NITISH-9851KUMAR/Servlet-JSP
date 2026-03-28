package session_tracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

@WebServlet("/cookies1")
public class Cookies1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String name= request.getParameter("name");

        // Create a cookies
        Cookie cookie= new Cookie("user_name", name);
        response.addCookie(cookie);;

        out.println("<h3>Hello "+name+", Welcome To Cookies Servlet One</h3>");
        out.println("<h3><a href='cookies2'>Go to Servlet2</a></h3>");

    }

}
