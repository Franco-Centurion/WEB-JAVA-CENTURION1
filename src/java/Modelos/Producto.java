
package Modelos;

public class Producto {
    int id;
    String nom;
    String fecha_vencimiento;
    double precio;
    int stock;
    String laboratorio;
    String tmedicamento;
    
    public Producto(){
    
    }

    public Producto(int id, String nombre, String fecha_vencimiento, double precio, int stock, String laboratorio, String tmedicamento) {
        this.id = id;
        this.nom = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fecha_vencimiento = fecha_vencimiento;
        this.laboratorio = laboratorio;
        this.tmedicamento = tmedicamento;
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

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getTmedicamento() {
        return tmedicamento;
    }

    public void setTmedicamento(String tmedicamento) {
        this.tmedicamento = tmedicamento;
    }    

    String getFecha_Vencimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}