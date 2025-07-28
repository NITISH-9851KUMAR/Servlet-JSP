package BasicsProgram.session_tracking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;

@WebServlet("/cookies2")
public class Cookies2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Getting all the cookies
        Cookie[] cookies= request.getCookies();

        String name= "";
        if(cookies== null){
            out.println("<h3>Cookies are Empty</h3>");
        }
        else{
            for(Cookie cookie: cookies){
                if(cookie.getName().equals("user_name")){
                    name= cookie.getValue();
                }
            }

            if(!name.isEmpty()){
                out.println("<h3>Hello "+name+", Welcome To Cookies Servlet 2nd</h3>");
            }
            else{
                out.println("<h3>Cookies user_name not found</h3>");
            }

        }

    }
}
