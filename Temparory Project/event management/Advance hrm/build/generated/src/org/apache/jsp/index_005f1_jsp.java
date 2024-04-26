package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>House Rental</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<!--\n");
      out.write("Template 2027 Melody\n");
      out.write("http://www.tooplate.com/view/2027-melody\n");
      out.write("-->\n");
      out.write("<link href=\"css/tooplate_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"css/jquery.lightbox-0.5.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" /> \n");
      out.write("\n");
      out.write("<script type='text/javascript' src='js/jquery.min.js'></script>\n");
      out.write("<script type='text/javascript' src='js/jquery.scrollTo-min.js'></script>\n");
      out.write("<script type='text/javascript' src='js/jquery.localscroll-min.js'></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.lightbox-0.5.js\"></script> \n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () \n");
      out.write("{\n");
      out.write("\t$.localScroll();\n");
      out.write("\t$('#map a').lightBox();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"tooplate_wrapper\">\n");
      out.write("\t<div id=\"tooplate_header\">\n");
      out.write("    \t<div id=\"top\"></div>\n");
      out.write("\t\t\n");
      out.write("        <div id=\"tooplate_menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index_1.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"owner.jsp\">Owner</a></li>\n");
      out.write("                <li><a href=\"client.jsp\">Client</a></li>\n");
      out.write("                <li><a href=\"customer.jsp\">Customer</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("            </ul>    \t\n");
      out.write("        </div> <!-- end of tooplate_menu -->\n");
      out.write("\t\t\n");
      out.write("        <div id=\"site_title\">\n");
      out.write("            <br>\n");
      out.write("      <font  size=\"7\" color=\"black\">Online House Rental Management</font>\n");
      out.write("             </div>\n");
      out.write("\t</div>\n");
      out.write("        <div id=\"home\"></div>\n");
      out.write("        <div class=\"content_box\">\n");
      out.write("            <h2>Welcome to Our Website</h2>\n");
      out.write("            <img src=\"Gallery/h4.jpg\" width=\"800\" height=\"250\" alt=\"Image 01\" /></div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("%");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
