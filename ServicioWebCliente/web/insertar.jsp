<%-- 
    Document   : insertar
    Created on : Aug 26, 2020, 8:43:29 PM
    Author     : Jose Roque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://use.fontawesome.com/83937a811a.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Registro</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header text-center alert alert-success">
                    <h2>Agregar Registro</h2>
                </div>
               
                <div class="card-body">
                    <form action="Controller">
                        <label>Nombre</label>
                        <input type="text" name="txtNombre" class="form-control">
                        <br>
                        <label>Precio</label>
                        <input type="text" name="txtPrecio" class="form-control">
                        <br>
                        <label>Marca</label>
                        <input type="text" name="txtMarca" class="form-control">
                        <br>
                        <input type="submit" name="accion" value="Guardar" class="btn btn-info">
                       
                        <a href="Controller?accion=index"  class="btn btn-warning">Regresar</a>
                       
                    </form>
                </div>
               
            </div>
           
        </div>
    </body>
</html>
