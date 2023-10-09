package accesoadatos;

import entidades.Huesped;
import entidades.TipoHabitacion;
import java.sql.*;
import javax.swing.JOptionPane;

public class TipoHabitacionData {

    private Connection con = null;

    public TipoHabitacionData() {
        con = Conexion.getConexion();

    }

    public void agregarTipoHab(TipoHabitacion tipoHab) {

        try {

            PreparedStatement ps = con.prepareStatement("INSERT INTO tipohabitacion"
                    + "(codigo, capacidadMaxima, cantidadCamas, tipoCamas,precioNoche) "
                    + "VALUES (?, ?, ?, ?, ? )", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, tipoHab.getCodigo());
            ps.setInt(2, tipoHab.getCapacidadMaxima());
            ps.setInt(3, tipoHab.getCantidadCamas());
            ps.setString(4, tipoHab.getTipoCamas());
            ps.setDouble(5, tipoHab.getPrecioNoche());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Tipo Habitacion agregado");
            } else {
                JOptionPane.showMessageDialog(null, "Este tipo de Habitacion ya existe");
            }
            rs.close();
            ps.close();
            System.out.println(rs);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo habitacion duplicada");
            System.err.println(ex);
        }
           

    public void eliminarTipoHabitacion(int codigo){
        String sql = "DELETE FROM TipoHabitacion WHERE codigo = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
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


//    public  Huesped buscarHuepedPorDni(int dni){
//        String sql = "SELECT idHuesped, nombre, apellido, DNI, domicilio, correo, celular, estado FROM huesped WHERE dni = ? AND estado = 1";
//        Huesped huesped = null;
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, dni);
//            ResultSet rs = ps.executeQuery();
//            if(rs.next()){
//                huesped = new Huesped();
//                huesped.setIdHuesped(rs.getInt("idHuesped"));
//                huesped.setNombre(rs.getString("nombre"));
//                huesped.setApellido(rs.getString("apellido"));
//                huesped.setDni(rs.getString("DNI"));
//                huesped.setDomicilio(rs.getString("domicilio"));
//                huesped.setCorreo(rs.getString("correo"));
//                huesped.setCelular(rs.getString("celular"));
//                huesped.setEstado(rs.getBoolean("estado"));
//                           
//            }else{
//                JOptionPane.showMessageDialog(null, "No existe ese huesped");
//            }
//            
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
//        }
//        
//        return huesped;
//    }
}
