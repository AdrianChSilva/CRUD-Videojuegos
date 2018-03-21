package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class altaSocio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- Latest compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery library -->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Popper JS -->\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Latest compiled JavaScript -->\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Alta de socios</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendavideojuegos", "root", ""); //el espacio de la contraseña está vacío
            Statement s = conexion.createStatement();
            ResultSet listado = s.executeQuery("SELECT * FROM socios");

            request.setCharacterEncoding("UTF-8");

            // Comprueba la existencia del número de socio introducido
            String consultaCodSocio = "SELECT * FROM socios WHERE CodSocios="
                    + Integer.valueOf(request.getParameter("CodSocios"));

            ResultSet numeroDeSocios = s.executeQuery(consultaCodSocio);
            numeroDeSocios.last();

            if (numeroDeSocios.getRow() != 0) {
                out.println("Lo siento, no se ha podido dar de alta, ya existe un socio con el código "
                        + request.getParameter("CodSocios") + ".");
            } else {
                String insercion = "INSERT INTO socios VALUES (" + Integer.valueOf(request.getParameter("CodSocios"))
                        + ", '" + request.getParameter("DNI")
                        + "', '" + request.getParameter("nombre")
                        + "', '" + request.getParameter("apellidos")
                        + "', '" + request.getParameter("edad")
                        + "', '" + request.getParameter("telefono")
                        + "', '" + request.getParameter("email")
                        + "', '" + request.getParameter("genero")
                        + "', '" + request.getParameter("direccion")
                        + "', '" + request.getParameter("asociado") + "')";
                s.execute(insercion);
                out.println("Socio dado de alta correctamente.");
            }
            conexion.close();
        
      out.write("\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"index.jsp\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-home\"></span> Página principal</button>\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script>document.location = \"index.jsp\"</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
