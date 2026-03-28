package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/parameter")
public class Parameter extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");

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
