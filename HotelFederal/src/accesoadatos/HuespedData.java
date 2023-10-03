
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
    
    
        public void agregarHuesped(Huesped huesped) {

        try {

            PreparedStatement ps = con.prepareStatement ("INSERT INTO huesped"
                    + "(nombre, apellido, DNI, domicilio, correo, celular) "
                    + "VALUES (?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getDni());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setString(6, huesped.getCelular());  
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "");
            }else{
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
    
    
    
  }  

