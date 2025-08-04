package filter;

import javax.servlet.*;
import java.io.IOException;

public class FilterClass implements Filter {

    // These three methods are life cycle method of Filter class

    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

        response.getWriter().println("<p>Before Filter</p>");
        //
        //
        //
        chain.doFilter(request, response);
        //
        //
        //
        response.getWriter().println("<p>After Filter</p>");

    }

    public void destroy(){
        throw new UnsupportedOperationException("Not Supported Yet.");
    }

}
