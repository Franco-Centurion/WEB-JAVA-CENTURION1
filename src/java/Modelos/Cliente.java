/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author DesarrolloWeb
 */
public class Cliente {
    int id;
    String nombre;
    String dni;
    String direccion;
    String fecha_Compra;
    
    public Cliente() {
    }

    public Cliente(int id, String nombre, String dni, String direccion, String fecha_Compra) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha_Compra = fecha_Compra;
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


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_Compra() {
        return fecha_Compra;
    }

    public void setFecha_Compra(String fecha_Compra) {
        this.fecha_Compra = fecha_Compra;
    }

}
 