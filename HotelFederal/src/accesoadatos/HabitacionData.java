
package accesoadatos;

import entidades.Habitacion;
import entidades.Huesped;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class HabitacionData {
    
    private Connection con = null;
    private TipoHabitacion tipoHab = new TipoHabitacion();
    

    public HabitacionData() {
        con = Conexion.getConexion();

    }

  public void altaHabitacion(Habitacion habitacion) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO habitacion"
                    + "(numero, estado, piso, idTipoHabitacion) "
                    + "VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            ps.setInt(1, habitacion.getNumero());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setInt(3, habitacion.getPiso());
            ps.setInt(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
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
    }
