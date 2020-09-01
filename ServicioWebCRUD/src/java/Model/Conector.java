/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jose Roque
 */
public class Conector {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String servidor = "localhost";
    private String db = "bd_libreria";
    private String user = "root";
    private String pass = "";
    private String cadena;
    
    Connection con;
    Statement st;
    
    public void conectar(){
        cadena = "jdbc:mysql://"+ servidor + "/" + db;
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(cadena, user, pass);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    public int consultaMultiple (String consulta){
        int resultado;
        
            try {
                this.conectar();
                this.st = this.con.createStatement();
                resultado = this.st.executeUpdate(consulta);
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
                return 0;
            }
            
            return resultado;
    }
    
    public ResultSet consulta( String consulta){
        try {
            this.conectar();
            ResultSet respuesta =null;
            this.st = this.con.createStatement();
            respuesta = st.executeQuery(consulta);
            return respuesta;
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return null;
    }
    
    public void desconectar(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
