package accesoadatos;

import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;
    private Huesped hue = null;
    private HuespedData hdata = null;
    private Habitacion hab = null;
    private HabitacionData habData = null;

    public ReservaData() {
        con = Conexion.getConexion();
        HuespedData hdata = new HuespedData();
        HabitacionData habData = new HabitacionData();
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
                PreparedStatement ps = con.prepareStatement("INSERT INTO reserva "
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

    public List<Reserva> obtenerReservasPorHuesped(int idHuesped) { //revisar
        ArrayList<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE idHuesped = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resr = new Reserva();
                resr.setIdReserva(rs.getInt("idReserva"));
                Huesped hue = hdata.buscarHuepedPorDni(rs.getInt("idHuesped"));
                Habitacion hab = habData.buscarHabitacionXNro(rs.getInt("idHabitacion"));
                resr.setHuesped(hue);
                resr.setHabitacion(hab);
                resr.setIdReserva(rs.getInt("idReserva"));
                reservas.add(resr);
                if (hue != null && hab != null) {
                    resr.setHuesped(hue);
                    resr.setHabitacion(hab);
                }
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }

        return reservas;
    }
    
        public void borrarReserva(int idHuesped, int idHabitacion, boolean estado ) {
        String sql = "UPDATE reserva SET estado = 0 WHERE idHuesped = ? AND idHabitacion = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setBoolean(1, estado);
            ps.setInt(1, idHuesped);
            ps.setInt(2, idHabitacion);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Reserva dada de baja");
            }else{
                JOptionPane.showMessageDialog(null, "Esta reserva no existe");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }

    }
        
        /*
            public void modificarReserva(Reserva reserva) {
    String sql = "UPDATE reserva SET fechaEntrada = ?, fechaSalida = ?, cantidadPersonas = ?, precioTotal = ?, estado = ? "
            + "WHERE idHuesped = ? AND idHabitacion = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(reserva.getFechaDeEntrada()));
        ps.setDate(2, Date.valueOf(reserva.getFechaDeSalida()));
        ps.setInt(3, reserva.getCantidadPersonas());
        ps.setDouble(4, reserva.getPrecioTotal());
        ps.setBoolean(5, reserva.isEstado());
        ps.setInt(6, reserva.getIdHuesped());
        ps.setInt(7, reserva.getIdHabitacion());

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated == 1) {
            JOptionPane.showMessageDialog(null, "Reserva modificada");
        } else {
            JOptionPane.showMessageDialog(null, "Reserva inexistente");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        System.err.println(ex);
    }
}
*/
        
        public void modificarReserva(Reserva reserva) {
    String sql = "UPDATE reserva SET fechaEntrada = ?, fechaSalida = ?, cantidadPersonas = ?, precioTotal = ?, estado = ? "
            + "WHERE idHuesped = ? AND idHabitacion = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(reserva.getFechaDeEntrada()));
        ps.setDate(2, Date.valueOf(reserva.getFechaDeSalida()));
        ps.setInt(3, reserva.getCantidadPersonas());
        ps.setDouble(4, reserva.getPrecioTotal());
        ps.setBoolean(5, reserva.isEstado());
        ps.setInt(6, reserva.getHuesped()); // Asumiendo que getHuesped() devuelve la ID del huésped
        ps.setInt(7, reserva.getHabitacion()); // Asumiendo que getHabitacion() devuelve la ID de la habitación

        int rowsUpdated = ps.executeUpdate();

        if (rowsUpdated == 1) {
            JOptionPane.showMessageDialog(null, "Reserva modificada");
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar la reserva");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        System.err.println(ex);
    }
}

}
