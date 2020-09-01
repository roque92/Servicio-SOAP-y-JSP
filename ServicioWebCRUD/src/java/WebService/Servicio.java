/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;


import Model.ConsultasDAO;
import Model.DatosVO;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jose Roque
 */
@WebService(serviceName = "Servicio")
public class Servicio {
    
    ConsultasDAO dao = new ConsultasDAO();
    DatosVO dvo = new DatosVO();

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "mostrar")
    public ArrayList <DatosVO> mostrar() {
        //TODO write your implementation code here:
        
        ArrayList datos = dao.consultaTabla();
        return datos;
    }

    /**
     * Web service operation
     * @param nombre
     * @param precio
     * @param marca
     */
    @WebMethod(operationName = "insertar")
    public DatosVO insertar(@WebParam(name = "nombre") String nombre, 
            @WebParam(name = "precio") double precio, 
            @WebParam(name = "marca") String marca) {
        //TODO write your implementation code here:
        
        dvo.setNombre(nombre);
        dvo.setPrecio(precio);
        dvo.setMarca(marca);
        dao.insertar(dvo);
        
        return dvo;
        
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "busquedaId")
    public DatosVO busquedaId(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        dvo = dao.consultaID(id);
        return dvo;
    }

    /**
     * Web service operation
     * @param nombre
     * @param precio
     * @param marca
     * @param buscado
     * @return 
     */
    @WebMethod(operationName = "modificar")
    public DatosVO modificar(@WebParam(name = "buscado") String buscado,
            @WebParam(name = "nombre") String nombre, 
            @WebParam(name = "precio") double precio, 
            @WebParam(name = "marca") String marca) {
        //TODO write your implementation code here:
        
        dvo.setNombre(nombre);
        dvo.setPrecio(precio);
        dvo.setMarca(marca);
        dvo.setBuscado(buscado);
        
        dao.modificar(dvo);
        return dvo;
    }

    /**
     * Web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "eliminar")
    public DatosVO eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        
        dvo = dao.eliminarID(id);
        return dvo;
    }
}
