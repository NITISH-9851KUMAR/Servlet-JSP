package JSP_Program;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTableTag extends TagSupport {

    int number; // This value fetch by tld Folder which is set by .jsp file
    String color; // It has also same as above attribute

    public void setNumber(int n){
        this.number= n;
    }

    public void setColor(String color){
        this.color= color;
    }

    public int doStartTag() throws JspException {
        JspWriter out= pageContext.getOut();

        try{

            out.println("<h3>Table:  "+number+"</h3>");
            out.println("<div style=' color:"+color+" ' >");
            for(int i= 1; i<=10; i++){
                out.println(number*i);
                out.println("<br>");
            }
            out.println("</div>");

        }catch(Exception e){
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
