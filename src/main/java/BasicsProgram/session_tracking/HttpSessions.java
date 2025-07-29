package BasicsProgram.session_tracking;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

@WebServlet("/http-session")
public class HttpSessions extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        String userName= request.getParameter("user_name");
        String password= request.getParameter("pass");

        HttpSession session= request.getSession();
        session.setAttribute("user_name", userName);

        if(userName.equals("nitish") && password.equals("1234")){

            RequestDispatcher rd= request.getRequestDispatcher("http-session-home.jsp");
            rd.forward(request, response);

        }else{
            out.println("<h3>Invalid User Name and password");
            RequestDispatcher rd= request.getRequestDispatcher("http-session.html");
            rd.include(request, response);
        }

    }
}
