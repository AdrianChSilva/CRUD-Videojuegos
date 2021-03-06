<%-- 
    Document   : facturas
    Author     : adrian.chamorrosilva
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Facturas</title>
    </head>
    <body>
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
                <h1>Gestión de Facturas</h1>      
                <p>Aquí podrá consultar el listado de Facturas, sacar una factura y eliminarla</p>
            </div>
        </div>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendavideojuegos", "root", "root");
            Statement s = conexion.createStatement();
            ResultSet listado = s.executeQuery("SELECT * FROM det_factura");
        %>
        <div class="container-fluid">
            <div class="table-responsive">
                <table class="table">
                    <tr><th>CodDetFact</th><th>CodVideojuegos</th><th>Cantidad</th><th>Precio</th><th>Factura_idFactura</th></tr>
                    <form method="get" action="altaVideojuego.jsp"> 
                        <tr><td><input type="text" name="CodDetFact" size="5"></td>
                            <td><input type="text" name="CodVideojuegos" size="7"></td>
                            <td><input type="text" name="Cantidad" size="5"></td>
                            <td><input type="text" name="Precio" size="5"></td>
                            <td><input type="text" name="Factura_idFactura" size="7"></td>

                            <td><button type="submit" value="Añadir" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span> Añadir</button></td><td></td></tr>           
                    </form>
                    <%
                        while (listado.next()) {
                            out.println("<tr><td>");
                            out.println(listado.getString("CodDetFact") + "</td>");
                            out.println("<td>" + listado.getString("CodVideojuegos") + "</td>");
                            out.println("<td>" + listado.getString("Cantidad") + "</td>");
                            out.println("<td>" + listado.getString("Precio") + "</td>");
                            out.println("<td>" + listado.getString("Factura_idFactura") + "</td>");
                    %>

                    <td>
                        <form method="get" action="borraFactura.jsp">
                            <input type="hidden" name="CodDetFact" value="<%=listado.getString("CodDetFact")%>"/>
                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span> Eliminar</button>
                        </form>
                    </td></tr>
                    <%
                        } // while   
                        conexion.close();
                    %>


                </table>
            </div>
        </div>

        <div class="text-center">&copy; Adrián Chamorro Silva</div>

        <!-- Scripts necesarios de bootstrap-->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
    <button  type="button" class="btn btn-primary btn-lg btn-block"  onclick="location.href = 'http://localhost:8080/ProyectoCRUD/index.jsp';">Volver al home</button>
</html>
