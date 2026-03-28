package session_tracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/url-rewriting1")
public class URLRewriting1 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        out.println("<h3>Name: "+name+"</a></h3>");

        // URL Rewriting
        // add user_name value with url , actually it is url rewriting
        out.println("<h3><a href= 'url-rewriting2?user_name= "+name+" ' >Servlet 2</a></h3>");
    }

}
