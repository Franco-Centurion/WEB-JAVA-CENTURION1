package Modelos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
   //Se usa en nuevaVenta 
  public Producto buscar(int id){
      Producto p=new Producto();
      String sql="select * from producto where idproducto="+id;
      try {
          con=cn.Conexion();
          ps=con.prepareStatement(sql);
          rs=ps.executeQuery();
          while (rs.next()) {
              p.setId(rs.getInt(1));
              p.setNom(rs.getString(2));
              p.setPrecio(rs.getDouble(3));
              p.setStock(rs.getInt(4));
              
             
          }
      } catch (Exception e) {
      }
     return p;
  }
  public int actualizarstock(int id, int stock){
      String sql="update producto set Stock=? where idproducto=?";
      try {
          con=cn.Conexion();
          ps=con.prepareStatement(sql);
          ps.setInt(1, stock);
          ps.setInt(2, id);
          ps.executeUpdate();
      } catch (Exception e) {
      }
      return r;
  }
    
  //*******Operaciones CRUD***************//    
    public List listar(){
        String sql="select * from producto";
        List<Producto>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Producto p=new Producto();
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));  
                p.setFecha_vencimiento(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setStock(rs.getInt(5));
                p.setLaboratorio(rs.getString(6));
                p.setTmedicamento(rs.getString(7));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Producto p){ 
        String sql="insert into producto(nombre,fecha_vencimiento,precio,stock,laboratorio,Tmedicamento)values(?,?,?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setString(2, p.getFecha_vencimiento());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setString(5, p.getLaboratorio());
            ps.setString(6, p.getTmedicamento());
            ps.executeUpdate();
        } catch (Exception e) {
            String ex= e.getMessage();
        }
        return r;
        
    }
    public Producto listarId(int id){
        Producto pr=new Producto();
        String sql="select * from producto where IdProducto="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                pr.setId(rs.getInt(1));
                pr.setNom(rs.getString(2));
                pr.setFecha_vencimiento(rs.getString(3));
                pr.setPrecio(rs.getDouble(4));
                pr.setStock(rs.getInt(5));
                pr.setLaboratorio(rs.getString(6));
                pr.setTmedicamento(rs.getString(7));
            }
        } catch (Exception e) {
        }
        return pr;
    }
    public int actualizar(Producto em){
        String sql="update producto set Nombres=?, Fecha_Vencimiento=?,Precio=?, Stock=?, Laboratorio=?, Tmedicamento=?  where id_producto=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, em.getNom());
            ps.setString(2, em.getFecha_vencimiento());
            ps.setDouble(3, em.getPrecio());
            ps.setInt(4, em.getStock());
            ps.setString(5, em.getLaboratorio());
            ps.setString(6, em.getTmedicamento());
            ps.setInt(7, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from producto where id_producto=" + id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
