package BasicsProgram;

import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class PrintTableTag extends TagSupport {

    public int number;

    public void setNumber(int n){
        this.number= n;
    }

    public String color;
    public void setColor(String color){
        this.color= color;
    }

    public int doStartTag() throws JspException{

        try{
            JspWriter out= pageContext.getOut();

            out.println("<div style='color:"+color+"' >");
            out.println("<h3 style='color:black '>Table of "+number+"</h1>");
            for(int i= 1; i<=10; i++){
                out.println(number+" * "+i+" : "+(number*i)+"<br>");
            }
            out.println("</div>");

        }catch (Exception e){
            e.printStackTrace();
        }

        return SKIP_BODY;
    }

}
