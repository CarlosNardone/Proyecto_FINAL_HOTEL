package accesoadatos;

import entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();

    }

    public void agregarHuesped(Huesped huesped) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO huesped"
                    + "(nombre, apellido, DNI, domicilio, correo, celular, estado) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Huesped Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Este huesped ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Dni duplicado");
            System.err.println(ex);
        }

    }

    
    //Este metodo modificar te lo modifica por ID
    /*
    public void modificarHuesped(Huesped huesped) {

        try {
            PreparedStatement ps = con.prepareStatement("UPDATE huesped SET  nombre = ?, apellido = ?,DNI = ?, domicilio = ?, correo = ? , celular = ?, estado = ? "
                    + "WHERE idHuesped = ?", Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            ps.setInt(8, huesped.getIdHuesped());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Huesped Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Huesped inexistente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            System.err.println(ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
    */

    
    //Y este metodo modificar te lo modifica por DNI
    public void modificarHuespedPorDNI(Huesped huesped) {
    String sql = "UPDATE huesped SET nombre = ?, apellido = ?, DNI = ?, domicilio = ?, correo = ?, celular = ?, estado = ? "
            + "WHERE DNI = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, huesped.getNombre());
        ps.setString(2, huesped.getApellido());
        ps.setString(3, huesped.getDni());
        ps.setString(4, huesped.getDomicilio());
        ps.setString(5, huesped.getCorreo());
        ps.setString(6, huesped.getCelular());
        ps.setBoolean(7, huesped.isEstado());
        ps.setString(8, huesped.getDni()); // Modifica por DNI

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated == 1) {
            JOptionPane.showMessageDialog(null, "Huesped Modificado");
        } else {
            JOptionPane.showMessageDialog(null, "Huesped inexistente");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        System.err.println(ex);
    } finally {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
}

    public void eliminarHuesped(String dni) {
        String sql = "UPDATE huesped SET estado = 0  WHERE DNI  = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Huesped dado de baja");
            } else {
                JOptionPane.showMessageDialog(null, "Este huesped ya esta dado de baja");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
    }
    
    public  Huesped buscarHuepedPorDni(int dni){
        String sql = "SELECT idHuesped, nombre, apellido, DNI, domicilio, correo, celular, estado FROM huesped WHERE dni = ? AND estado = 1";
        Huesped huesped = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setApellido(rs.getString("apellido"));
                huesped.setDni(rs.getString("DNI"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getString("celular"));
                huesped.setEstado(rs.getBoolean("estado"));
                           
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese huesped");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        
        return huesped;
    }

}
