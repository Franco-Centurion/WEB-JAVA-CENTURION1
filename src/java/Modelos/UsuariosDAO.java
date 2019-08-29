package Modelos;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DesarrolloWeb
 */
public class UsuariosDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public Usuarios validar(String nombreUsuario, String PassUsuario) {
        String sql = "select * from  usuarios where nombre='" + nombreUsuario + "' and contraseña='" + PassUsuario + "'";
        Usuarios Usuarios = new Usuarios();
        try {
            con = cn.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuarios.setId(rs.getInt(1));
                Usuarios.setNombre(rs.getString(2));
                Usuarios.setContraseña(rs.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Usuarios;

    }

}
