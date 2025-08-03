package JSP_Program;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.time.LocalDate;
import java.time.LocalTime;

public class TagHandler extends TagSupport{

    public int doStartTag() throws JspException {

        JspWriter out= pageContext.getOut();

        try{

            out.println("<p>Welcome To Tag Handler</p>");
            out.println("This is Basic Tag Handler Class!");
            out.println("<br>");
            out.println(LocalDate.now()+" "+ LocalTime.now());

        }catch(Exception e){
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
