package BasicsProgram;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/attribute")
public class Attribute extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out= response.getWriter();

        // Sum is attribute value so use getAttribute() method
        int sum= (int)request.getAttribute("sum");

        int n1= Integer.parseInt(request.getParameter("number1"));
        int n2= Integer.parseInt(request.getParameter("number2"));


        out.println("<h3>Sum of Number: "+sum+"</h3>");
        out.println("<h3>Multiplication of Number: "+(n1*n2)+"</h3>");
    }

}
