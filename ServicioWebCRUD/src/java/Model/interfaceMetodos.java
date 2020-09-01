/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Jose Roque
 */
public interface interfaceMetodos {
    
    public ArrayList <DatosVO> consultaTabla();
    public DatosVO consultaID (int id);
    public void insertar (DatosVO dvo);
    public void modificar (DatosVO dvo);
    public DatosVO eliminarID (int id);
    
}
