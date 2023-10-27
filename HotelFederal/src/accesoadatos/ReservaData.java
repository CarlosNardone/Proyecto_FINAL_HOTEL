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


    public void agregarReserva(Reserva reserva) {
        try {
                 
                PreparedStatement ps = con.prepareStatement("INSERT INTO reserva "
                        + "(fechaEntrada, fechaSalida, cantidadPersonas, precioTotal, estado, idHuesped, idHabitacion) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

                ps.setDate(1, Date.valueOf(reserva.getFechaDeEntrada()));
                ps.setDate(2, Date.valueOf(reserva.getFechaDeSalida()));
                ps.setInt(3, reserva.getCantidadPersonas());
                ps.setDouble(4, reserva.getPrecioTotal());
                ps.setBoolean(5, reserva.isEstado());
                ps.setInt(6,reserva.getHuesped().getIdHuesped());
                ps.setInt(7,reserva.getHabitacion().getIdHabitacion());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Nueva Reserva Creada");
                } else {
                    JOptionPane.showMessageDialog(null, "Reserva existente");
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
            System.err.println(ex);
        }
    }

    
    private boolean habitacionExiste(int idHabitacion) {
        try {
            JOptionPane.showMessageDialog(null, "idHabitacion " + idHabitacion);
            PreparedStatement ps = con.prepareStatement("SELECT idHabitacion FROM habitacion WHERE idHabitacion = ?");
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            return rs.next(); 
        } catch (SQLException ex) {
            System.err.println(ex);
            return false; 
        }
    }
    
    
    
    public List<Reserva> ListarReservasPorIdHuesped(int idHuesped) { 
    List<Reserva> reservas = new ArrayList<>();
    String sql = "SELECT * FROM reserva WHERE idHuesped = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idHuesped);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Reserva reserva = new Reserva();
            HuespedData huespedData = new HuespedData();
            HabitacionData habitacionData = new HabitacionData();
            reserva.setIdReserva(rs.getInt("idReserva"));
            reserva.setFechaDeEntrada(rs.getDate("fechaEntrada").toLocalDate());
            reserva.setFechaDeSalida(rs.getDate("fechaSalida").toLocalDate());
            reserva.setCantidadPersonas(rs.getInt("cantidadPersonas"));
            reserva.setPrecioTotal(rs.getDouble("precioTotal"));
            reserva.setEstado(rs.getBoolean("estado"));
            Huesped huesped = huespedData.buscarHuespedPorId(rs.getInt("idHuesped"));
            Habitacion habitacion = habitacionData.buscarHabitacionPorId(rs.getInt("idHabitacion"));
            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);

            reservas.add(reserva);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
    }

    return reservas;
}

    
    public List<Reserva> ListarReservasPorFechas(Date fechaDesde, Date fechaHasta) {
    List<Reserva> reservas = new ArrayList<>();
    String sql = "SELECT * FROM reserva WHERE fechaEntrada BETWEEN ? AND ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, new java.sql.Date(fechaDesde.getTime()));
        ps.setDate(2, new java.sql.Date(fechaHasta.getTime()));
        ResultSet rs = ps.executeQuery();
        
        HuespedData huespedData = new HuespedData();
        HabitacionData habitacionData = new HabitacionData();
        
        while (rs.next()) {
            Reserva reserva = new Reserva();
            reserva.setIdReserva(rs.getInt("idReserva"));
            reserva.setFechaDeEntrada(rs.getDate("fechaEntrada").toLocalDate());
            reserva.setFechaDeSalida(rs.getDate("fechaSalida").toLocalDate());
            reserva.setCantidadPersonas(rs.getInt("cantidadPersonas"));
            reserva.setPrecioTotal(rs.getDouble("precioTotal"));
            reserva.setEstado(rs.getBoolean("estado"));
            Huesped huesped = huespedData.buscarHuespedPorId(rs.getInt("idHuesped"));
            Habitacion habitacion = habitacionData.buscarHabitacionPorId(rs.getInt("idHabitacion"));
            reserva.setHuesped(huesped);
            reserva.setHabitacion(habitacion);

            reservas.add(reserva);
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
    }

    return reservas;
}
    
    
    
        public void cancelarReserva(int idReserva ) {
        String sql = "UPDATE reserva SET estado = 0 WHERE idReserva = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idReserva);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Reserva dada de baja");
            }else{
                JOptionPane.showMessageDialog(null, "Esta reserva ya se encuentra cancelada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva");
        }

    }
        

        
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
//        ps.setInt(6, reserva.getHuesped()); // Asumiendo que getHuesped() devuelve la ID del huésped
//        ps.setInt(7, reserva.getHabitacion()); // Asumiendo que getHabitacion() devuelve la ID de la habitación

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
