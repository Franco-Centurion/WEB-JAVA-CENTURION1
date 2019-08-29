
package Modelos;

public class Producto {
    int id;
    String nombre;
    int fecha_vencimiento;
    double precio;
    int stock;
    String laboratorio;
    String tmedicamento;
    
    public Producto(){
    
    }

    public Producto(int id, String nombre, int fecha_vencimiento, double precio, int stock, String laboratorio, String tmedicamento) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio = precio;
        this.stock = stock;
        this.laboratorio = laboratorio;
        this.tmedicamento = tmedicamento;
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

    public int getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(int fecha_vencimiento) {
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
    
    
}