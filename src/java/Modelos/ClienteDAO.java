
package Modelos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//corregir
public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public Cliente buscar(String dni){
        Cliente c=new Cliente();
        String sql="Select * from cliente where Dni="+dni;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                c.setId(rs.getInt(1));
                
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));                
                          
            }
        } catch (Exception e) {
        }
        return c;
    }

//*******Operaciones CRUD***************//
    public List listar(){
        String sql="select * from cliente";
        List<Cliente>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                Cliente cl=new Cliente();
                cl.setId(rs.getInt(1));
                cl.setNom(rs.getString(2));
                cl.setDir(rs.getString(3));
                cl.setFecha_compra(rs.getString(4));
                cl.setDni(rs.getString(5));                           
                lista.add(cl);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public int agregar(Cliente cl){ 
        String sql="insert into cliente(nombre, direccion,fecha_Compra,DNI)values(?,?,?,?)";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getDir());
            ps.setString(3, cl.getFecha_compra());
            ps.setString(4, cl.getDni());       
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
        
    }
    public Cliente listarId(int id){
        Cliente cli=new Cliente();
        String sql="select * from cliente where cliente="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()) {
                cli.setNom(rs.getString(2));
                cli.setDir(rs.getString(3));  
                cli.setFecha_compra(rs.getString(4));
                cli.setDni(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return cli;
    }
    public int actualizar(Cliente em){
        String sql="update cliente set nombre=?, direccion=?,fecha_Compra=?,DNI=? where id=?";
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
           
            ps.setString(1, em.getNom());
            ps.setString(2, em.getDir());
            ps.setString(3, em.getFecha_compra());
            ps.setString(4, em.getDni());
            ps.setInt(5, em.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    public void delete(int id){
        String sql="delete from cliente where id="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}