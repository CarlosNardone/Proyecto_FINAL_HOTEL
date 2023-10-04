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

    
        public void modificarHuesped(Huesped huesped){
//        String sql = "UPDATE huesped SET  nombre = ?, apellido = ?, DNI = ?, domicilio = ?, correo = ? , celular = ?, estado = ? "
//                + "WHERE DNI = ?";
        String sql = "UPDATE huesped SET  nombre = ?, apellido = ?,DNI = ?, domicilio = ?, correo = ? , celular = ?, estado = ? "
                + "WHERE idHuesped = ?";
        Connection con = null;
        PreparedStatement ps = null;
         
        try {
            con = Conexion.getConexion();
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
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Huesped Modificado");
            }else{
                JOptionPane.showMessageDialog(null, "Huesped inexistente");
            }  
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
            System.err.println(ex);
        }
        
           finally {
        try {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
        }

    
    public void eliminarHuesped(String dni){
                String sql = "UPDATE huesped SET estado = 0  WHERE DNI  = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
          int exito =  ps.executeUpdate();
         
           if(exito == 1){
               
               JOptionPane.showMessageDialog(null, "Huesped dado de baja");
           } else{
               JOptionPane.showMessageDialog(null, "Este huesped ya esta dado de baja");
           }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
    }
    
    
}
        
        
        
    
    
    

