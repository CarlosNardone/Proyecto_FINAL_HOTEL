
package accesoadatos;


import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import java.sql.*;
import javax.swing.JOptionPane;


public class ReservaData {
    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();
    }
    
      public void agregarReserva(Reserva reserva, Habitacion habitacion,Huesped huesped ) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO reserva"
                    + "(fechaEntrada, fechaSalida, cantidadPersonas, precioTotal, estado, idHuesped, idHabitacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            ps.setDate(1, Date.valueOf(reserva.getFechaDeEntrada()));
            ps.setDate(2, Date.valueOf(reserva.getFechaDeSalida()));
            ps.setInt(3, reserva.getCantidadPersonas());
            ps.setDouble(4, reserva.getPrecioTotal());
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, huesped.getIdHuesped());
            ps.setInt(7, habitacion.getIdHabitacion());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Reserva Ejecutada");
            } else {
                JOptionPane.showMessageDialog(null, "Reserva existente");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Reserva duplicada"); //revisar
            System.err.println(ex);
        }

    }
}
