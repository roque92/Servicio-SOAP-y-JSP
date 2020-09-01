/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorServlets;

import Modelo.Libreria;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webservice.DatosVO;

/**
 *
 * @author Jose Roque
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    //referencia a la accion que se elija
    private String accesso = "";
    //Clases JSP
    private String index = "index.jsp";
    private String insert = "insertar.jsp";
    private String editar = "modif.jsp?id=";
    private String nombre = "&nombre=";
    private String buscardo = "";

    Libreria libreria = new Libreria();
    DatosVO dvo = new DatosVO();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//        String accion = request.getParameter("accion");
//        
//        if(accion.equals("insert")){
//            accesso = insert;
//        } else if(accion.equals("Guardar")){
//            String nombre = request.getParameter("txtNombre");
//            double precio = Double.parseDouble(request.getParameter("txtPrecio"));
//            String marcar = request.getParameter("txtMarca");
//            
//            libreria.insertar(nombre, precio, marcar);
//            
//            accesso = insert;
//        }
//        
//        if(accion.equals("index")){
//            accesso = index;
//            
//        }
        //Disparador para interactuar entre varios clases
//        RequestDispatcher dispatcher = request.getRequestDispatcher(accesso);
//        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");

        if (accion.equals("insert")) {
            response.sendRedirect(insert);
        } else if (accion.equals("Guardar")) {
            String nombre = request.getParameter("txtNombre");
            double precio = Double.parseDouble(request.getParameter("txtPrecio"));
            String marcar = request.getParameter("txtMarca");

            libreria.insertar(nombre, precio, marcar);

            response.sendRedirect(insert);
        } else if (accion.equals("eliminar")) {
            int id = Integer.parseInt(request.getParameter("id"));
            libreria.eliminar(id);
            response.sendRedirect(index);
        } else if (accion.equals("editar")) {
            response.sendRedirect(editar + request.getParameter("id") + nombre + request.getParameter("nombre"));

        } else if (accion.equals("Modificar")) {
            if (buscardo.isEmpty()) {
                buscardo = request.getParameter("txtNombre");

            }

            String nombre = request.getParameter("txtNombre");
            double precio = Double.parseDouble(request.getParameter("txtPrecio"));
            String marca = request.getParameter("txtMarca");

            libreria.modificar(buscardo, nombre, precio, marca);
            response.sendRedirect(index);
        }

        if (accion.equals("index")) {
            response.sendRedirect(index);

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
