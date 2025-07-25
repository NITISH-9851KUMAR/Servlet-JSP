package BasicsProgram;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
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
