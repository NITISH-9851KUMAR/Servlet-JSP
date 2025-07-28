package BasicsProgram;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/send-redirect")
public class SendRedirect extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String search= request.getParameter("search");

        // sendRedirect method is generally used to redirect external Link
        response.sendRedirect("https://www.google.com/search?q="+search+" ");

    }

}
