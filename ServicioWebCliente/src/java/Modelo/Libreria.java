/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.xml.ws.WebServiceRef;
import webservice.DatosVO;
import webservice.Servicio_Service;

/**
 *
 * @author Jose Roque
 */
public class Libreria {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ServicioWebCRUD/Servicio.wsdl")
    private Servicio_Service service;

    public Libreria() {
    }

    public java.util.ArrayList<webservice.DatosVO> mostrar() {
        webservice.Servicio_Service service = new webservice.Servicio_Service();
        webservice.Servicio port = service.getServicioPort();
        return (ArrayList<DatosVO>) port.mostrar();
    }

    public DatosVO insertar(java.lang.String nombre, double precio, java.lang.String marca) {
        webservice.Servicio_Service service = new webservice.Servicio_Service();
        webservice.Servicio port = service.getServicioPort();
        return port.insertar(nombre, precio, marca);
    }

    public DatosVO eliminar(int id) {
        webservice.Servicio_Service service = new webservice.Servicio_Service();
        webservice.Servicio port = service.getServicioPort();
        return port.eliminar(id);
    }

    public DatosVO busquedaId(int id) {
        webservice.Servicio_Service service = new webservice.Servicio_Service();
        webservice.Servicio port = service.getServicioPort();
        return port.busquedaId(id);
    }

    public DatosVO modificar(java.lang.String buscado, java.lang.String nombre, double precio, java.lang.String marca) {
        webservice.Servicio_Service service = new webservice.Servicio_Service();
        webservice.Servicio port = service.getServicioPort();
        return port.modificar(buscado, nombre, precio, marca);
    }
    
    

}
