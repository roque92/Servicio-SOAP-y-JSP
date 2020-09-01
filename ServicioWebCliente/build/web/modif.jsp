<%-- 
    Document   : modif
    Created on : Aug 28, 2020, 8:41:20 PM
    Author     : Jose Roque
--%>

<%@page import="webservice.DatosVO"%>
<%@page import="Modelo.Libreria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://use.fontawesome.com/83937a811a.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Articulo</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header text-center alert alert-danger">
                    <h2>Modificar Articulo</h2>
                </div>
                <%
                    Libreria libreria = new Libreria();
                    DatosVO dvo = new DatosVO();
                    dvo = libreria.busquedaId(Integer.parseInt(request.getParameter("id")));
                %>
                <div class="card-body">
                    <form action="Controller">

                        <label>Id</label>
                        <input type="number" value="<%= dvo.getId()%>" name="txtId" readonly="" class="form-control">
                        <br>
                        <label>Nombre</label>
                        <input type="text" value="<%= dvo.getNombre()%>" name="txtNombre" class="form-control">
                        <br>
                        <label>Precio</label>
                        <input type="text" value="<%= dvo.getPrecio()%>"  name="txtPrecio" class="form-control">
                        <br>
                        <label>Marca</label>
                        <input type="text" value="<%= dvo.getMarca()%>"  name="txtMarca" class="form-control">
                        <br>
                        <input type="submit" name="accion" value="Modificar" class="btn btn-danger">

                        <a href="Controller?accion=index" class="btn btn-warning">Regresar</a>

                    </form>
                </div>

            </div>

        </div>
    </body>
</html>
