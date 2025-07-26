package BasicsProgram;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

@WebServlet("/parameter")
public class Parameter extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        // Parameter-> Parameter are those value which is set by user
        // It is value of form data

        // num1, num2 calculate parameter value
        int num1= Integer.parseInt(request.getParameter("number1"));
        int num2= Integer.parseInt(request.getParameter("number2"));

        int add= num1+num2;

        // It is Attribute which is set by servlet
        // and Another servlet fetch its value
        request.setAttribute("sum", add);

        RequestDispatcher rd= request.getRequestDispatcher("attribute");
        rd.forward(request, response);
    }

}
