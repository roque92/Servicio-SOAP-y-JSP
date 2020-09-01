<%-- 
    Document   : index
    Created on : Aug 26, 2020, 6:44:03 PM
    Author     : Jose Roque
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="webservice.DatosVO"%>
<%@page import="Modelo.Libreria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://use.fontawesome.com/83937a811a.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Libreria la Bendicion</title>
    </head>
    <body>
        <div class="container mt-4"> 
            <div class="card-header text-right alert alert-warning">
                <div class="text-center">
                    <h1>CRUD</h1>
                </div>
                <a href="Controller?accion=insert" class="btn btn-primary">Insertar <i class="fa fa-plus-circle"></i></a>
            </div>
            <div>
                 <h2 class="text-center">Registros</h2>
            </div>
            <div>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NOMBRE</th>
                            <th>PRECIO</th>
                            <th>MARCA</th>
                            <th>OPERACIONES </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Libreria libreria = new Libreria();
                            ArrayList <DatosVO> datos = libreria.mostrar();
                            for (DatosVO dvo : datos){  
                        %>
                        <tr>
                            <td><%= dvo.getId()%></td>
                            <td><%= dvo.getNombre()%></td>
                            <td><%= dvo.getPrecio()%></td>
                            <td><%= dvo.getMarca()%></td>
                            <td>
                                <a href="Controller?accion=editar&id=<%= dvo.getId()%>&nombre=<%= dvo.getNombre()%>" class="btn btn-info"><i class="fa fa-edit"></i></a>
                                <a href="Controller?accion=eliminar&id=<%= dvo.getId()%>" class="btn btn-danger"><i class="fa fa-trash"></i></a>
                            </td>
                        </tr>
                        
                        <%
                            }
                        %>
                    </tbody>
                </table>
            </div>
        </div>
       
    </body>
</html>
