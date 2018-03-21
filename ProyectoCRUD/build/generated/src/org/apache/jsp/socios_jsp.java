package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class socios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestión de socios</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron jumbotron-fluid\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Gestión de socios</h1>      \n");
      out.write("                <p>Aquí podrá consultar el listado de socios, modificarlos, insertarlos y eliminarlos</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendavideojuegos", "root", ""); 
            Statement s = conexion.createStatement();
            ResultSet listado = s.executeQuery("SELECT * FROM socios");
        
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr><th>CodSocio</th><th>DNI</th><th>Nombre</th><th>Apellidos</th><!--<th>Edad</th>--><th>Teléfono</th><th>Email</th><th>Genero</th><th>Dirección</th><th>Asociado</th></tr>\n");
      out.write("                    <form method=\"get\" action=\"altaSocio.jsp\"> <!-- Hacer altaSocio.jsp-->\n");
      out.write("                        <tr><td><input type=\"text\" name=\"CodSocios\" size=\"5\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"DNI\" size=\"7\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Nombre\" size=\"5\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Apellidos\" size=\"5\"></td>\n");
      out.write("                           <!-- <td><input type=\"text\" name=\"Edad\" size=\"2\"></td>-->\n");
      out.write("                            <td><input type=\"text\" name=\"Teléfono\" size=\"7\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Email\" size=\"20\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Genero\" size=\"1\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Direccion\" size=\"20\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"Asociado\" size=\"20\"></td>\n");
      out.write("\n");
      out.write("                            <td><button type=\"submit\" value=\"Añadir\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-plus\"></span> Añadir</button></td><td></td></tr>           \n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    ");

                        while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("CodSocios") + "</td>");
                            out.println("<td>" + listado.getString("DNI") + "</td>");
                            out.println("<td>" + listado.getString("Nombre") + "</td>");
                            out.println("<td>" + listado.getString("Apellidos") + "</td>");
                           // out.println("<td>" + listado.getString("Edad") + "</td>");
                            out.println("<td>" + listado.getString("Telefono") + "</td>");
                            out.println("<td>" + listado.getString("Email") + "</td>");
                            out.println("<td>" + listado.getString("Genero") + "</td>");
                            out.println("<td>" + listado.getString("Direccion") + "</td>");
                            out.println("<td>" + listado.getString("Asociado") + "</td>");
                    
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"get\" action=\"editaSocio.jsp\"> <!--Hacer editaSocio.jsp-->\n");
      out.write("                            <input type=\"hidden\" name=\"CodSocios\" value=\"");
      out.print(listado.getString("CodSocios"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"DNI\" value=\"");
      out.print(listado.getString("DNI"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Nombre\" value=\"");
      out.print(listado.getString("Nombre"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Apellidos\" value=\"");
      out.print(listado.getString("Apellidos"));
      out.write("\">\n");
      out.write("                            \n");
      out.write("                            <input type=\"hidden\" name=\"Telefono\" value=\"");
      out.print(listado.getString("Telefono"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Email\" value=\"");
      out.print(listado.getString("Email"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Genero\" value=\"");
      out.print(listado.getString("Genero"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Direccion\" value=\"");
      out.print(listado.getString("Direccion"));
      out.write("\">\n");
      out.write("                            <input type=\"hidden\" name=\"Asociado\" value=\"");
      out.print(listado.getString("Asociado"));
      out.write("\">\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-info\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</button>\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("                        <form method=\"get\" action=\"borraSocio.jsp\">\n");
      out.write("                            <input type=\"hidden\" name=\"CodSocios\" value=\"");
      out.print(listado.getString("CodSocios"));
      out.write("\"/>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span> Eliminar</button>\n");
      out.write("                        </form>\n");
      out.write("                    </td></tr>\n");
      out.write("                    ");

                        } // while   
                        conexion.close();
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"text-center\">&copy; Adrián Chamorro Silva</div>\n");
      out.write("\n");
      out.write("        <!-- Scripts necesarios de bootstrap-->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
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
