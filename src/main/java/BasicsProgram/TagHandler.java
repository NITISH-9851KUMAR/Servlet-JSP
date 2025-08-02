package BasicsProgram;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.Date;

public class TagHandler extends TagSupport{

    public int doStartTag() throws JspException{

        try{

            JspWriter out= pageContext.getOut();
            out.println("<h2>Hello this is my custom tag</h2>");
            out.println("<h2>This is custom paragraph</h2>");
            out.println("<p>"+new Date()+"</p>");

        }catch(Exception e){
            e.printStackTrace();
        }

        return SKIP_BODY;// It returns 0
    }

}
