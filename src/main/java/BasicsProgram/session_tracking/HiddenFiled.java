package BasicsProgram.session_tracking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
