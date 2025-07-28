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

        if(userName.equals("nitish") && password.equals("1234")){

            //if use setAttribute then its value limite only one page to its next page
            // After next page we can not use this value
//            request.setAttribute("user_name", userName);

            // Instead of This we use HttpSession
            HttpSession session= request.getSession();
            session.setAttribute("user_name", userName);

            RequestDispatcher rd= request.getRequestDispatcher("send-redirect-welcome.jsp");
            rd.forward(request, response);
        }else{
            out.println("Invalid User Name and Password");
            RequestDispatcher rd= request.getRequestDispatcher("http-session.html");
            rd.include(request, response);

        }

    }
}
