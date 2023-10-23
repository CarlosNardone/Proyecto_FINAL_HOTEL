
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
    
    /*
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva"); //revisar
            System.err.println(ex);
        }

    }
      */
    
    public void agregarReserva(Reserva reserva, Habitacion habitacion, Huesped huesped) {
    try {
        // Verifica si la habitación existe antes de insertar la reserva
        if (habitacionExiste(habitacion.getIdHabitacion())) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO reserva " +
                    "(fechaEntrada, fechaSalida, cantidadPersonas, precioTotal, estado, idHuesped, idHabitacion) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

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
        } else {
            JOptionPane.showMessageDialog(null, "La habitación no existe");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        System.err.println(ex);
    }
}

      // Método para verificar si una habitación existe en la base de datos
private boolean habitacionExiste(int idHabitacion) {
    try {
        JOptionPane.showMessageDialog(null, "idHabitacion " + idHabitacion);
        PreparedStatement ps = con.prepareStatement("SELECT idHabitacion FROM habitacion WHERE idHabitacion = ?");
        ps.setInt(1, idHabitacion);
        ResultSet rs = ps.executeQuery();
        return rs.next(); // Devuelve true si la habitación existe, de lo contrario, false.
    } catch (SQLException ex) {
        System.err.println(ex);
        return false; // En caso de error, asumimos que la habitación no existe.
    }
}
}
