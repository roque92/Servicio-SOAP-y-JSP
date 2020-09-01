/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Jose Roque
 */
public class ConsultasDAO implements interfaceMetodos {

    @Override
    public ArrayList<DatosVO> consultaTabla() {
        Conector con = new Conector();
        ArrayList<DatosVO> datos = new ArrayList();
        try {
            con.conectar();
            ResultSet rs = con.consulta("SELECT * FROM tbl_articulo;");

            while (rs.next()) {
                DatosVO dvo1 = new DatosVO();
                dvo1.setId(rs.getInt(1));
                dvo1.setNombre(rs.getString(2));
                dvo1.setPrecio(rs.getDouble(3));
                dvo1.setMarca(rs.getString(4));

                datos.add(dvo1);
            }
            con.desconectar();
        } catch (SQLException e) {
            System.err.println("Error " + e.getMessage());
        }
        return datos;
    }

    @Override
    public DatosVO consultaID(int id) {
        Conector con = new Conector();
        DatosVO dvo = new DatosVO();

        try {
            con.conectar();
            ResultSet rs = con.consulta("SELECT * FROM tbl_articulo WHERE id = " + id + ";");

            while (rs.next()) {
                dvo.setId(rs.getInt(1));
                dvo.setNombre(rs.getString(2));
                dvo.setPrecio(rs.getDouble(3));
                dvo.setMarca(rs.getString(4));
             
            }
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }
        con.desconectar();
        return dvo;
    }

    @Override
    public void insertar(DatosVO dvo) {
        Conector con = new Conector();
        try {
            con.conectar();
            con.consultaMultiple("INSERT INTO tbl_articulo (articulo, precio, marca)"
                    + "VALUES ('" + dvo.getNombre() + "', " + dvo.getPrecio() + ", '" + dvo.getMarca() + "'); ");
        } catch (Exception e) {
            System.err.println("Error " + e.getMessage());
        }

        con.desconectar();
    }

    @Override
    public void modificar(DatosVO dvo) {
        Conector con = new Conector();

        try {
            con.consultaMultiple("UPDATE tbl_articulo \n"
                    + "SET articulo = '"+dvo.getNombre()+"', precio = "+dvo.getPrecio()+", marca = '"+dvo.getMarca()+"' \n"
                    + "WHERE articulo = '"+dvo.getBuscado()+"';");
        } catch (Exception e) {
             System.err.println("Error " + e.getMessage());
        }
         con.desconectar(); 
    }

    @Override
    public DatosVO eliminarID(int id) {
        
       Conector con = new Conector();
       DatosVO dvo = new DatosVO();
       
        try {
            con.conectar();
            con.consultaMultiple("DELETE FROM tbl_articulo WHERE id = "+id+";");
        } catch (Exception e) {
             System.err.println("Error " + e.getMessage());
        }
        con.desconectar();

        return dvo;
    }

}
