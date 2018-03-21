package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class editaVideojuego_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Gestion - Pag Principal</title>\n");
      out.write("    </head>\n");
      out.write("    ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"panel panel-info\">\n");
      out.write("            <div class=\"panel-heading text-center\">Editar socio</div>\n");
      out.write("            <form method=\"get\" action=\"altaVideojuego.jsp\">\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("                    <label>&nbsp;&nbsp;Código Videojuego&nbsp;</label><input type=\"text\" size=\"5\" name=\"CodVideojuegos\" value=\"");
      out.print( request.getParameter("CodVideojuegos"));
      out.write("\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Título&nbsp;</label><input type=\"text\" size=\"7\" name=\"titulo\" value=\"");
      out.print( request.getParameter("titulo"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Plataforma&nbsp;</label><input type=\"text\" size=\"5\" name=\"plataforma\" value=\"");
      out.print( request.getParameter("plataforma"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Desarrolladora&nbsp;</label><input type=\"text\" size=\"5\" name=\"desarrolladora\" value=\"");
      out.print( request.getParameter("desarrolladora"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Publisher&nbsp;</label><input type=\"text\" name=\"publisher\" size=\"7\" value=\"");
      out.print( request.getParameter("publisher"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Precio&nbsp;</label><input type=\"text\" name=\"precio\" size=\"20\" value=\"");
      out.print( request.getParameter("precio"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label>&nbsp;&nbsp;Stock&nbsp;</label><input type=\"text\" name=\"stock\" size=\"1\" value=\"");
      out.print( request.getParameter("stock"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("                &nbsp;&nbsp;<a href=\"index.jsp\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span>Cancelar</a>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-success\"><span class=\"glyphicon glyphicon-ok\"></span>Aceptar</button><br><br>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"text-center\">&copy;Adrian Chamorro Silva</div>\n");
      out.write("    </div>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
