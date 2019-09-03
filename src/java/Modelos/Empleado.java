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
public class Empleado {
    int id;
    String dni;
    String nom;
    String user;
    int tel;
    
    public Empleado(){
    
    
    }

    public Empleado(int id, String dni, String nom, int tel,String user) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.tel = tel;
        this.user= user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
    
}
