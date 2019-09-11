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
    String nom;
    String dni;
    String dir;
    String fecha_compra;
    
    public Cliente() {
    }

    public Cliente(int id, String nombre, String dni, String direccion, String fecha_compra) {
        this.id = id;
        this.nom = nombre;
        this.dir = direccion;
        this.fecha_compra = fecha_compra;
        this.dni= dni;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nombre) {
        this.nom = nombre;
    }


    public String getDir() {
        return dir;
    }

    public void setDir(String direccion) {
        this.dir = direccion;
    }

    public String getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(String fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
 