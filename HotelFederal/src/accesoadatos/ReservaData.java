/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;


import entidades.Habitacion;
import entidades.Huesped;
import entidades.Reserva;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUE
 */
public class ReservaData {
    private Connection con = null;

    public ReservaData() {
        
    }
    
      public void agregarReserva(Reserva reserva, Habitacion habitacion,Huesped huesped ) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO reserva"
                    + "(fechaEntrada, fechaSalida, cantidadPersonas, precioTotal, estado, idHuesped, idHabitacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            ps.setDate(1, Date.valueOf(reserva.getFechaDeEntrada()));
            ps.setDate(1, Date.valueOf(reserva.getFechaDeSalida()));
            ps.setInt(3, reserva.getCantidadPersonas());
            ps.setDouble(4, reserva.getPrecioTotal());
            ps.setBoolean(5, reserva.isEstado());
            ps.setInt(6, huesped.getIdHuesped());
            ps.setInt(7, habitacion.getIdHabitacion());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Habitacion Agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Esta Habitacion ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Habitacion duplicada");
            System.err.println(ex);
        }

    }
}
