/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jose Roque
 */
public class DatosVO {
    
    private int id;
    private String nombre, marca, buscado;
    private double precio;

    public DatosVO(int id, String nombre, String marca, String buscado, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.buscado = buscado;
        this.precio = precio;
    }

    public DatosVO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getBuscado() {
        return buscado;
    }

    public void setBuscado(String buscado) {
        this.buscado = buscado;
    }
    
    
    
    
    
}
