/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;


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
    
      public void agregarReserva() {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO reserva"
                    + "(fechaEntrada, fechaSalida, cantidadPersonas, precioTotal, estado, idHuesped, idHabitacion) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
    
            ps.setLocalDate(1, reserva.getLocalDate());
            ps.setBoolean(2, reserva.isEstado());
            ps.setInt(3, reserva.getPiso());
            ps.setInt(4, reserva.getTipoHabitacion().getIdTipoHabitacion());
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
