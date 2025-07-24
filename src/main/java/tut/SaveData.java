package tut;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/save-data")
public class SaveData extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // database program
        String name= req.getParameter("name");
        String email= req.getParameter("mail");
        String pass= req.getParameter("pass");

        out.println("<h5>Name: "+name+"</h5>");
        out.println("<h5>Email: "+email+"</h5>");
        out.println("<h5>Password: "+pass+"</h5>");

    }
}
